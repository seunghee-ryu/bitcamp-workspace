package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberAddCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[회원 등록]");

    Member member = new Member();
    member.setName(Prompt.inputString("이름? "));
    member.setEmail(Prompt.inputString("이메일? "));
    member.setPassword(Prompt.inputString("암호? "));
    member.setPhoto(Prompt.inputString("사진? "));
    member.setTel(Prompt.inputString("전화? "));

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "insert into pms_member(name,email,password,photo,tel) values(?,?,?,?,?)"
            );) {

      stmt.setString(1, member.getName());
      stmt.setString(2, member.getEmail());
      stmt.setString(3, member.getPassword());
      stmt.setString(4, member.getPhoto());
      stmt.setString(5, member.getTel());
      int count = stmt.executeUpdate();

      System.out.println("게시글을 등록하였습니다.");
    }
    catch (Exception e) {
      System.out.println("게시글 등록 실행 중 오류");
      e.printStackTrace();
    }


  }
}

//create table pms_member(
//    no int not null,
//    name varchar(30) not null,
//    email varchar(50) not null,
//    password varchar(50) not null,
//    photo varchar(255),
//    tel varchar(20),
//    cdt datetime default now()
//    );
//
//alter table pms_member
//add constraint pms_member_pk primary key(no);
//
//alter table pms_member
//modify column no int not null auto_increment;
