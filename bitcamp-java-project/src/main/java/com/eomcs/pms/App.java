package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.handler.BoardAddCommand;
import com.eomcs.pms.handler.BoardDeleteCommand;
import com.eomcs.pms.handler.BoardDetailCommand;
import com.eomcs.pms.handler.BoardListCommand;
import com.eomcs.pms.handler.BoardUpdateCommand;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.handler.HelloCommand;
import com.eomcs.pms.handler.MemberAddCommand;
import com.eomcs.pms.handler.MemberDeleteCommand;
import com.eomcs.pms.handler.MemberDetailCommand;
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
import com.eomcs.util.CsvObject;
import com.eomcs.util.Prompt;
import com.google.gson.Gson;

public class App {

  // main(), saveBoards(), loadBoards() 가 공유하는 필드
  static List<Board> boardList = new ArrayList<>();
  static File boardFile = new File("./board.json"); // 게시글을 저장할 파일 정보

  // main(), saveMembers(), loadMembers() 가 공유하는 필드
  static List<Member> memberList = new LinkedList<>();
  static File memberFile = new File("./member.json"); // 회원을 저장할 파일 정보

  // main(), saveProjects(), loadProjects() 가 공유하는 필드
  static List<Project> projectList = new LinkedList<>();
  static File projectFile = new File("./project.json"); // 프로젝트를 저장할 파일 정보

  // main(), saveTasks(), loadTasks() 가 공유하는 필드
  static List<Task> taskList = new ArrayList<>();
  static File taskFile = new File("./task.json"); // 작업을 저장할 파일 정보


  public static void main(String[] args) {

    // 파일에서 데이터 로딩
    loadObjects(boardList, boardFile, Board[].class);
    loadObjects(memberList, memberFile, Member[].class);
    loadObjects(projectList, projectFile, Project[].class);
    loadObjects(taskList, taskFile, Task[].class);

    Map<String,Command> commandMap = new HashMap<>();

    commandMap.put("/board/add", new BoardAddCommand(boardList));
    commandMap.put("/board/list", new BoardListCommand(boardList));
    commandMap.put("/board/detail", new BoardDetailCommand(boardList));
    commandMap.put("/board/update", new BoardUpdateCommand(boardList));
    commandMap.put("/board/delete", new BoardDeleteCommand(boardList));

    MemberListCommand memberListCommand = new MemberListCommand(memberList);
    commandMap.put("/member/add", new MemberAddCommand(memberList));
    commandMap.put("/member/list", memberListCommand);
    commandMap.put("/member/detail", new MemberDetailCommand(memberList));
    commandMap.put("/member/update", new MemberUpdateCommand(memberList));
    commandMap.put("/member/delete", new MemberDeleteCommand(memberList));

    commandMap.put("/project/add", new ProjectAddCommand(projectList, memberListCommand));
    commandMap.put("/project/list", new ProjectListCommand(projectList));
    commandMap.put("/project/detail", new ProjectDetailCommand(projectList));
    commandMap.put("/project/update", new ProjectUpdateCommand(projectList, memberListCommand));
    commandMap.put("/project/delete", new ProjectDeleteCommand(projectList));

    commandMap.put("/task/add", new TaskAddCommand(taskList, memberListCommand));
    commandMap.put("/task/list", new TaskListCommand(taskList));
    commandMap.put("/task/detail", new TaskDetailCommand(taskList));
    commandMap.put("/task/update", new TaskUpdateCommand(taskList, memberListCommand));
    commandMap.put("/task/delete", new TaskDeleteCommand(taskList));

    commandMap.put("/hello", new HelloCommand());

    Deque<String> commandStack = new ArrayDeque<>();
    Queue<String> commandQueue = new LinkedList<>();

    loop:
      while (true) {
        String inputStr = Prompt.inputString("명령> ");

        if (inputStr.length() == 0) {
          continue;
        }

        commandStack.push(inputStr);
        commandQueue.offer(inputStr);

        switch (inputStr) {
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
                // 실행 중 오류가 발생할 수 있는 코드는 try 블록 안에 둔다.
                command.execute();
              } catch (Exception e) {
                // 오류가 발생하면 그 정보를 갖고 있는 객체의 클래스 이름을 출력한다.
                System.out.println("--------------------------------------------------------------");
                System.out.printf("명령어 실행 중 오류 발생: %s\n", e);
                System.out.println("--------------------------------------------------------------");
              }
            } else {
              System.out.println("실행할 수 없는 명령입니다.");
            }
        }
        System.out.println();
      }

    Prompt.close();

    // 데이터를 파일에 저장
    saveObjects(boardList, boardFile);
    saveObjects(memberList, memberFile);
    saveObjects(projectList, projectFile);
    saveObjects(taskList, taskFile);
  }

  static void printCommandHistory(Iterator<String> iterator) {
    try {
      int count = 0;
      while (iterator.hasNext()) {
        System.out.println(iterator.next());
        count++;

        if ((count % 5) == 0 && Prompt.inputString(":").equalsIgnoreCase("q")) {
          break;
        }
      }
    } catch (Exception e) {
      System.out.println("history 명령 처리 중 오류 발생!");
    }
  }

  private static <T extends CsvObject> void saveObjects(Collection<T> list, File file) {
    BufferedWriter out = null;
    try {
      // 파일로 데이터를 출력할 때 사용할 도구를 준비한다.
      out = new BufferedWriter(new FileWriter(file));
      //컬렉션 객체를 통째로 JSON 문자열로 내보내기
      Gson gson = new Gson();
      String jsonStr = gson.toJson(list);
      out.write(jsonStr);


      out.flush();
      System.out.printf("총 %d 개의 객체를 '%s'에 저장했습니다.\n", list.size(), file.getName());

    } catch (IOException e) {
      System.out.printf("객체를 '%s' 파일에 쓰는 중 오류 발생! - %s\n ", file.getName(), e.getMessage());

    } finally {
      try {
        out.close();
      } catch (IOException e) {
        // FileWriter를 닫을 때 발생하는 예외는 무시한다.
      }
    }
  }


  private static <T> void loadObjects(
      Collection<T> list,
      File file,
      Class<T[]> clazz
      ) {
    BufferedReader in = null;

    try {
      // 파일을 읽을 때 사용할 도구를 준비한다.
      in = new BufferedReader(new FileReader(file));

      //1)
      //      StringBuilder strBuilder = new StringBuilder();
      //
      //      int b = 0;
      //
      //      while ((b = in.read()) != -1) {
      //        strBuilder.append((char) b);
      //      }
      //      // JSON 문자열을 가지고 자바 객체를 생성한다.
      //      Gson gson = new Gson();
      //      T[] arr = gson.fromJson(strBuilder.toString(), clazz);
      //      for (T obj : arr) {
      //        list.add(obj);
      //      }

      // 2) 입력 스트림을 직접 Gson에게 전달하기
      //      Gson gson = new Gson();
      //      T[] arr = gson.fromJson(in, clazz);
      //      for (T obj : arr) {
      //        list.add(obj);
      //      }

      // 3) 배열을 컬렉션에 바로 전달하기
      //      Gson gson = new Gson();
      //      T[] arr = gson.fromJson(in, clazz);
      //      list.addAll(Arrays.asList(arr));

      // 4) 코드 정리

      list.addAll(Arrays.asList(new Gson().fromJson(in, clazz)));


      System.out.printf("'%s' 파일에서 총 %d 개의 객체를 로딩했습니다.\n",
          file.getName(), list.size());

    } catch (Exception e) {
      System.out.printf("'%s' 파일 읽기 중 오류 발생! - %s\n",
          file.getName(), e.getMessage());
      // 파일에서 데이터를 읽다가 오류가 발생하더라도
      // 시스템을 멈추지 않고 계속 실행하게 한다.
      // 이것이 예외처리를 하는 이유이다!!!
    } finally {
      try {
        in.close();
      } catch (Exception e) {
        // close() 실행하다가 오류가 발생한 경우 무시한다.
        // 왜? 닫다가 발생한 오류는 특별히 처리할 게 없다.
      }
    }
  }

}


