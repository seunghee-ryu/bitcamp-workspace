package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Task;
import com.eomcs.util.Prompt;

public class TaskAddCommand implements Command {

  MemberListCommand memberListCommand;

  public TaskAddCommand(MemberListCommand memberListCommand) {
    this.memberListCommand = memberListCommand;
  }

  @Override
  public void execute() {
    System.out.println("[작업 등록]");

    Task task = new Task();

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111")) {

      try (PreparedStatement stmt = con.prepareStatement(
          "select p.no, p.title"
              + " from pms_project p"
              + " order by p.no desc");
          ResultSet rs = stmt.executeQuery()) {

        ArrayList<Integer> noList = new ArrayList<>();

        System.out.println("프로젝트들:");
        while (rs.next()) {
          System.out.printf("  %d, %s\n", rs.getInt("no"), rs.getString("title"));
          noList.add(rs.getInt("no"));
        }
        if (noList.size() == 0) {
          System.out.println("프로젝트가 없습니다.");
          return;
        }

        while (true) {
          int no = Prompt.inputInt("프로젝트 번호?(0: 취소) ");
          if (no == 0) {
            System.out.println("작업 등록을 취소합니다.");
            return;
          } else if (noList.contains(no)) {
            task.setProjectNo(no);
            break;
          }
          System.out.println("프로젝트 번호가 맞지 않습니다.");
        }
      }

      task.setContent(Prompt.inputString("내용? "));
      task.setDeadline(Prompt.inputDate("마감일? "));
      task.setStatus(Prompt.inputInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> "));


      try (PreparedStatement stmt = con.prepareStatement(
          "select mp.member_no, m.name"
              + " from pms_member_project mp inner join pms_member m"
              + " on mp.member_no=m.no"
              + " where mp.project_no=" + task.getProjectNo()
              + " order by m.name asc");
          ResultSet rs = stmt.executeQuery()) {

        ArrayList<Integer> noList = new ArrayList<>();

        System.out.println("멤버들:");
        while (rs.next()) {
          System.out.printf("  %d, %s\n", rs.getInt("member_no"), rs.getString("name"));
          noList.add(rs.getInt("member_no"));
        }
        if (noList.size() == 0) {
          System.out.println("멤버가 없습니다.");
          return;
        }

        while (true) {
          int no = Prompt.inputInt("멤버 번호?(0: 취소) ");
          if (no == 0) {
            System.out.println("작업 등록을 취소합니다.");
            return;
          } else if (noList.contains(no)) {
            Member member = new Member();
            member.setNo(no);
            task.setOwner(member);
            break;
          }
          System.out.println("멤버 번호가 맞지 않습니다.");
        }
      }

      try (PreparedStatement stmt = con.prepareStatement(
          "insert into pms_task(content,deadline,owner,project_no,status)"
              + " values(?,?,?,?,?)")) {

        stmt.setString(1, task.getContent());
        stmt.setDate(2, task.getDeadline());
        stmt.setInt(3, task.getOwner().getNo());
        stmt.setInt(4, task.getProjectNo());
        stmt.setInt(5, task.getStatus());
        stmt.executeUpdate();

        System.out.println("작업을 등록했습니다.");
      }

    } catch (Exception e) {
      System.out.println("오류 발생!");
      e.printStackTrace();
    }
  }
}


//create table pms_task(
//    no int not null,
//    content text not null,
//    deadline date not null,
//    owner int not null,   /* pms_member 의 PK 컬럼을 가리키는 외부키다*/
//    project_no int not null,
//    status int default 0
//    );
//
//alter table pms_task
//add constraint pms_task_pk primary key(no);
//
//alter table pms_task
//modify column no int not null auto_increment;
//
//alter table pms_task
//add constraint pms_task_fk1 foreign key(owner, project_no)
//references pms_member_project(member_no, project_no);
//
//alter table pms_task
//add constraint pms_task_fk2 foreign key(project_no) references pms_project(no);
