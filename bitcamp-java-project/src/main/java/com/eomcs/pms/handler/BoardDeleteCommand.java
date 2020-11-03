package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.eomcs.util.Prompt;

public class BoardDeleteCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[게시물 삭제]");
    int no = Prompt.inputInt("번호? ");

    String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("게시글 삭제를 취소하였습니다.");
      return;
    }

    // 데이터 베이스와 연결
    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        Statement stmt = con.createStatement()) {

      // 데이터베이스의 no를 사용하여 데이터를 삭제한다.
      String sql = String.format("delete from pms_board where no=%d", no);

      // 삭제가 실행된다면 몇개가 실행되는지 리턴되고 실행되지 않으면 count는 0이 된다.
      int count = stmt.executeUpdate(sql);

      // count가 0 일때는 게시글이 없다는 화면을 출력한다.
      if (count == 0) {
        System.out.println("해당 번호의 게시글이 없습니다.");
        return;
      }
      System.out.println("게시글을 삭제하였습니다.");
    } catch (Exception e) {
      System.out.println("게시글 삭제 중 오류 발생");
      e.printStackTrace();
    }
  }
}
