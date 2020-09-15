package com.eomcs.pms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.handler.BoardAddCommand;
import com.eomcs.pms.handler.BoardDeleteCommand;
import com.eomcs.pms.handler.BoardDetailCommand;
import com.eomcs.pms.handler.BoardListCommand;
import com.eomcs.pms.handler.BoardSearchCommand;
import com.eomcs.pms.handler.BoardUpdateCommand;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.handler.HelloCommand;
import com.eomcs.pms.handler.MemberAddCommand;
import com.eomcs.pms.handler.MemberDatailCommand;
import com.eomcs.pms.handler.MemberDeleteCommand;
import com.eomcs.pms.handler.MemberListCommand;
import com.eomcs.pms.handler.MemberUpdateCommand;
import com.eomcs.pms.handler.ProjectAddCommand;
import com.eomcs.pms.handler.ProjectDeleteCommand;
import com.eomcs.pms.handler.ProjectDetailCommand;
import com.eomcs.pms.handler.ProjectListCommand;
import com.eomcs.pms.handler.ProjectUpdateCommand;
import com.eomcs.pms.handler.TaskAddCommand;
import com.eomcs.pms.handler.TaskDeleteCommand;
import com.eomcs.pms.handler.TaskDetailCommand;
import com.eomcs.pms.handler.TaskListCommand;
import com.eomcs.pms.handler.TaskUpdateCommand;
import com.eomcs.util.Prompt;

public class App {

  static List<Board> boardList = new ArrayList<>();
  static List<Member> memberList = new LinkedList<>();
  static List<Project> projectList = new LinkedList<>();
  static List<Task> taskList = new ArrayList<>();

  // 데이터를 저장할 파일의 정보
  static File boardFile = new File("./board.csv");
  static File memberFile = new File("./member.csv");
  static File projectFile = new File("./project.csv");
  static File taskFile = new File("./task.csv");

  // 앱 객체에 커맨드 객체를 보관한다.
  public static void main(String[] args) {

    loadBoards();
    loadMembers();
    loadProjects();
    loadTasks();


    // 커맨드 객체를 저장할 맵 객체를 준비한다.
    Map<String, Command> commandMap = new HashMap<>();

    // 맵 객체에 커맨드 객체를 보관한다.
    commandMap.put("/board/add", new BoardAddCommand(boardList));
    commandMap.put("/board/list", new BoardListCommand(boardList));
    commandMap.put("/board/delete", new BoardDeleteCommand(boardList));
    commandMap.put("/board/detail", new BoardDetailCommand(boardList));
    commandMap.put("/board/update", new BoardUpdateCommand(boardList));
    commandMap.put("/board/search", new BoardSearchCommand(boardList));




    MemberListCommand memberListCommand = new MemberListCommand(memberList);
    commandMap.put("/member/list", memberListCommand);
    commandMap.put("/member/add", new MemberAddCommand(memberList));
    commandMap.put("/member/delete", new MemberDeleteCommand(memberList));
    commandMap.put("/member/update", new MemberUpdateCommand(memberList));
    commandMap.put("/member/detail", new MemberDatailCommand(memberList));



    commandMap.put("/project/add", new ProjectAddCommand(projectList, memberListCommand));
    commandMap.put("/project/list", new ProjectListCommand(projectList));
    commandMap.put("/project/delete", new ProjectDeleteCommand(projectList));
    commandMap.put("/project/update", new ProjectUpdateCommand(projectList, memberListCommand));
    commandMap.put("/proejct/detail", new ProjectDetailCommand(projectList));


    commandMap.put("/task/list", new TaskListCommand(taskList));
    commandMap.put("/task/add", new TaskAddCommand(taskList, memberListCommand));
    commandMap.put("/task/delete", new TaskDeleteCommand(taskList));
    commandMap.put("/task/update", new TaskUpdateCommand(taskList, memberListCommand));
    commandMap.put("/task/detail", new TaskDetailCommand(taskList));

    Deque<String> commandStack = new ArrayDeque<>();
    Queue<String> commandQueue = new LinkedList<>();

    commandMap.put("/hello", new HelloCommand());


    loop:
      while (true) {
        String inputStr = Prompt.inputString("명령> ");

        if (inputStr.length() == 0) {
          continue;
        }

        // 사용자가 입력한 명령을 보관한다.
        commandStack.push(inputStr);
        commandQueue.offer(inputStr);

        switch (inputStr) {

          // Iterator 패턴을 이용하면,
          // 자료 구조와 상관없이 일관된 방법으로 목록의 값을 조회할 수 있다.
          case "history": printCommandHistory(commandStack.iterator()); break;
          case "history2": printCommandHistory(commandQueue.iterator()); break;

          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            Command command = commandMap.get(inputStr);
            if (command != null) {
              try {
                command.execute();
              } catch (Exception e) {
                System.out.printf("명령 처리 중 오류 발생: %s\n%s\n",
                    e.getClass().getName(),
                    e.getMessage());
              }
            } else {
              System.out.println("실행할 수 없는 명령입니다.");
            }
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    Prompt.close();

    // 프로그램을 종료하기 전에 List 객체에 보관된 객체를 파일에 저장한다.

    saveBoards();
    saveMembers();
    saveProjects();
    saveTasks();
  }

  static void printCommandHistory(Iterator<String> iterator) {
    try {
      int count = 0;
      while (iterator.hasNext()) {
        System.out.println(iterator.next());
        count++;

        // 5개 출력할 때 마다 계속 출력할지 묻는다.
        if ((count % 5) == 0 && Prompt.inputString(":").equalsIgnoreCase("q")) {
          break;
        }
      }
    } catch (Exception e) {
      System.out.println("history 명령 처리 중 오류 발생!");
    }
  }

  public static void saveBoards() {
    System.out.println("[게시글 저장]");

    FileWriter out = null;
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileWriter(boardFile);

      // 각각의 게시글을 파일로 출력한다.
      for (Board board : boardList) {
        out.write(toCsvString(board));
      }

      // 사용이 끝난 파일 출력 도구를 닫는다.
      // 이 과정에서 파일 출력 도구의 임시 메모리(버퍼)에 잔류하는 찌꺼기 데이터를 마무리로 완전히 출력한다.
    } catch (IOException e) {
      System.out.println("파일 출력 작업 중에 오류 발생");
    } finally {
      try {
        out.close();
      } catch (Exception e) {}
    }
  }

  static void loadBoards() {
    System.out.println("[게시글 파일 로딩]");

    FileReader out = null;
    Scanner scanner = null;
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileReader(boardFile);
      scanner = new Scanner(out);

      while(true) {
        try {

          boardList.add(valueOfCsv(scanner.nextLine()));

        } catch (NoSuchElementException e) {
          break;
        }
      }
      // 사용이 끝난 파일 출력 도구를 닫는다.
      // 이 과정에서 파일 출력 도구의 임시 메모리(버퍼)에 잔류하는 찌꺼기 데이터를 마무리로 완전히 출력한다.
    } catch (IOException e) {
      System.out.println("파일 출력 작업 중에 오류 발생");
      e.printStackTrace();
    } finally {
      try { scanner.close();} catch (Exception e) {}
      try { out.close();} catch (Exception e) {}
    }
  }

  // board 객체를 생성하는 팩토리 메서드의 역할을 한다.
  static Board valueOfCsv(String csv) {

    String[] values = csv.split(",");

    Board board = new Board();

    board.setNo(Integer.parseInt(values[0]));
    board.setTitle(values[1]);
    board.setContent(values[2]);
    board.setWriter(values[3]);
    board.setRegisteredDate(Date.valueOf(values[4]));
    board.setViewCount(Integer.parseInt(values[5]));

    return board;

  }

  static String toCsvString(Board board) {

    return String.format("%d,%s,%s,%s,%s,%d\n",
        board.getNo(),
        board.getTitle(),
        board.getContent(),
        board.getWriter(),
        board.getRegisteredDate().toString(),
        board.getViewCount());


  }



  public static void saveMembers() {
    System.out.println("[멤버 저장]");

    FileWriter out = null;
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileWriter(memberFile);

      // 각각의 게시글을 파일로 출력한다.
      for (Member member : memberList) {
        String record = String.format("%d,%s,%s,%s,%s,%s,%s\n",
            member.getNo(),
            member.getName(),
            member.getEmail(),
            member.getPassword(),
            member.getPhoto(),
            member.getTel(),
            member.getRegisteredDate().toString());
        out.write(record);
      }

      // 사용이 끝난 파일 출력 도구를 닫는다.
      // 이 과정에서 파일 출력 도구의 임시 메모리(버퍼)에 잔류하는 찌꺼기 데이터를 마무리로 완전히 출력한다.
    } catch (IOException e) {
      System.out.println("파일 출력 작업 중에 오류 발생");
      e.printStackTrace();
    } finally {
      try {
        out.close();
      } catch (Exception e) {}
    }
  }

  static void loadMembers() {
    System.out.println("[회원 파일 로딩]");

    FileReader out = null;
    Scanner scanner = null;
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileReader(memberFile);
      scanner = new Scanner(out);

      while(true) {
        try {
          // 파일에서 한 줄 읽는다.
          String record = scanner.nextLine();

          String[] values = record.split(",");

          Member member = new Member();

          member.setNo(Integer.parseInt(values[0]));
          member.setName(values[1]);
          member.setEmail(values[2]);
          member.setPassword(values[3]);
          member.setPhoto(values[4]);
          member.setTel(values[5]);
          member.setRegisteredDate(Date.valueOf(values[6]));

          memberList.add(member);

        } catch (NoSuchElementException e) {
          break;
        }
      }
      // 사용이 끝난 파일 출력 도구를 닫는다.
      // 이 과정에서 파일 출력 도구의 임시 메모리(버퍼)에 잔류하는 찌꺼기 데이터를 마무리로 완전히 출력한다.
    } catch (IOException e) {
      System.out.println("파일 출력 작업 중에 오류 발생");
      e.printStackTrace();
    } finally {
      try { scanner.close();} catch (Exception e) {}
      try { out.close();} catch (Exception e) {}
    }
  }



  public static void saveProjects() {
    System.out.println("[프로젝트 저장]");

    FileWriter out = null;
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileWriter(projectFile);

      // 각각의 게시글을 파일로 출력한다.
      for (Project project : projectList) {
        String record = String.format("%d,%s,%s,%s,%s,%s,%s\n",
            project.getNo(),
            project.getTitle(),
            project.getContent(),
            project.getStartDate().toString(),
            project.getEndDate().toString(),
            project.getOwner(),
            project.getMembers());
        out.write(record);
      }

      // 사용이 끝난 파일 출력 도구를 닫는다.
      // 이 과정에서 파일 출력 도구의 임시 메모리(버퍼)에 잔류하는 찌꺼기 데이터를 마무리로 완전히 출력한다.
    } catch (IOException e) {
      System.out.println("파일 출력 작업 중에 오류 발생");
      e.printStackTrace();
    } finally {
      try {
        out.close();
      } catch (Exception e) {}
    }
  }

  static void loadProjects() {
    System.out.println("[프로젝트 파일 로딩]");

    FileReader out = null;
    Scanner scanner = null;
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileReader(projectFile);
      scanner = new Scanner(out);

      while(true) {
        try {
          // 파일에서 한 줄 읽는다.
          String record = scanner.nextLine();

          String[] values = record.split(",");

          Project project = new Project();

          project.setNo(Integer.parseInt(values[0]));
          project.setTitle(values[1]);
          project.setContent(values[2]);
          project.setStartDate(Date.valueOf(values[3]));
          project.setEndDate(Date.valueOf(values[4]));
          project.setOwner(values[5]);
          project.setMembers(values[6]);

          projectList.add(project);

        } catch (NoSuchElementException e) {
          break;
        }
      }
      // 사용이 끝난 파일 출력 도구를 닫는다.
      // 이 과정에서 파일 출력 도구의 임시 메모리(버퍼)에 잔류하는 찌꺼기 데이터를 마무리로 완전히 출력한다.
    } catch (IOException e) {
      System.out.println("파일 출력 작업 중에 오류 발생");
      e.printStackTrace();
    } finally {
      try { scanner.close();} catch (Exception e) {}
      try { out.close();} catch (Exception e) {}
    }
  }




  public static void saveTasks() {
    System.out.println("[작업 저장]");

    FileWriter out = null;
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileWriter(taskFile);

      // 각각의 게시글을 파일로 출력한다.
      for (Task task : taskList) {
        String record = String.format("%d,%s,%s,%s,%s\n",
            task.getNo(),
            task.getContent(),
            task.getDeadline().toString(),
            task.getStatus(),
            task.getOwner());
        out.write(record);
      }

      // 사용이 끝난 파일 출력 도구를 닫는다.
      // 이 과정에서 파일 출력 도구의 임시 메모리(버퍼)에 잔류하는 찌꺼기 데이터를 마무리로 완전히 출력한다.
    } catch (IOException e) {
      System.out.println("파일 출력 작업 중에 오류 발생");
      e.printStackTrace();
    } finally {
      try {
        out.close();
      } catch (Exception e) {}
    }
  }

  static void loadTasks() {
    System.out.println("[작업 파일 로딩]");

    FileReader out = null;
    Scanner scanner = null;
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileReader(taskFile);
      scanner = new Scanner(out);

      while(true) {
        try {
          // 파일에서 한 줄 읽는다.
          String record = scanner.nextLine();

          String[] values = record.split(",");

          Task task = new Task();

          task.setNo(Integer.parseInt(values[0]));
          task.setContent(values[1]);
          task.setDeadline(Date.valueOf(values[2]));
          task.setStatus(Integer.parseInt(values[3]));
          task.setOwner(values[4]);

          taskList.add(task);

        } catch (NoSuchElementException e) {
          break;
        }
      }
      // 사용이 끝난 파일 출력 도구를 닫는다.
      // 이 과정에서 파일 출력 도구의 임시 메모리(버퍼)에 잔류하는 찌꺼기 데이터를 마무리로 완전히 출력한다.
    } catch (IOException e) {
      System.out.println("파일 출력 작업 중에 오류 발생");
      e.printStackTrace();
    } finally {
      try { scanner.close();} catch (Exception e) {}
      try { out.close();} catch (Exception e) {}
    }
  }


}
