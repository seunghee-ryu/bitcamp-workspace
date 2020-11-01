package com.eomcs.pms.handler;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.eomcs.util.Prompt;

public class ProjectDetailCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[프로젝트 상세보기]");
    int no = Prompt.inputInt("번호? ");

    try (
        java.sql.Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");

        PreparedStatement stmt = con.prepareStatement(
            "select title, content, std, edd, owner, members"
                + " from pms_project"
                + " where no = " + no);

        ResultSet rs = stmt.executeQuery()) {

      if (rs.next()) {
        System.out.printf("프로젝트명: %s\n", rs.getString("title"));
        System.out.printf("내용: %s\n", rs.getString("content"));
        System.out.printf("기간: %s ~ %s\n", rs.getDate("std"), rs.getDate("edd"));
        System.out.printf("담당자: %s\n", rs.getString("owner"));
        System.out.printf("팀원: %s\n", rs.getString("members"));
      } else {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      }
    } catch (Exception e) {
      System.out.println("게시글 조회 중 오류 발생");
      e.printStackTrace();
    }
  }
}
