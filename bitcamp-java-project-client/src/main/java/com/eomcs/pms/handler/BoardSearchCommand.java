package com.eomcs.pms.handler;

import java.util.List;
import java.util.Map;
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardSearchCommand implements Command {

  BoardDao boardDao;

  public BoardSearchCommand(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void execute(Map<String,Object> context) {
    System.out.println("[게시물 검색]");

    try {
      String keyword = Prompt.inputString("검색어? ");


      System.out.println("번호, 제목, 작성자, 등록일, 조회수");
      List<Board> list = boardDao.findAll("%" + keyword + "%");
      for (Board board : list) {
        System.out.printf("%d, %s, %s, %s, %d\n",
            board.getNo(),
            board.getTitle(),
            board.getWriter().getName(),
            board.getRegisteredDate(),
            board.getViewCount());
      }


    } catch (Exception e) {
      System.out.println("게시글 등록 중 오류 발생!");
      e.printStackTrace();
    }
  }
}



//InputStream inputStream = Resources.getResourceAsStream(//
//    "com/eomcs/mybatis/ex03/mybatis-config.xml");
//SqlSessionFactory factory = //
//new SqlSessionFactoryBuilder().build(inputStream);
//
//SqlSession sqlSession = factory.openSession();
//
//// dynamic sql?
//// => 조건에 따라 SQL을 달리 생성하는 것
//// => mybatis는 이를 위해 조건에 따라 SQL을 변경하거나,
//// 동일한 SQL을 반복적으로 생성할 수 있는 문법을 제공한다.
////
//// 실행 예:
//// => 사용자로부터 게시글의 번호를 입력 받아 조회한다.
//// => 만약 오류가 발생하면 전체 게시글을 출력한다.
//
//Scanner keyScan = new Scanner(System.in);
//System.out.print("게시글 번호? ");
//String str = keyScan.nextLine();
//keyScan.close();
//
//List<Board> list = null;
//
//try {
//  // 게시글 번호가 주어지면 해당 게시글만 출력한다.
//  list = sqlSession.selectList("BoardMapper.select3", Integer.parseInt(str));
//} catch (Exception e) {
//  // e.printStackTrace();
//
//  // 게시글 번호가 없거나 예외가 발생하면 전체 게시글을 출력한다.
//  list = sqlSession.selectList("BoardMapper.select3");
//
//  // 이때 같은 SQL 문(select3)을 실행한다.
//  // => Mapper 파일에서 조건으로 SQL을 제어한다.
//  // => 조건에 따라 여러 개의 SQL을 생성할 필요가 없어 편리하다.
//  // => 다만 SQL 문을 작성하는데 복잡하다.
//}
//
//for (Board board : list) {
//  System.out.printf("%d, %s, %s, %d\n", //
//      board.getNo(), //
//      board.getTitle(), //
//      board.getRegisteredDate(), //
//      board.getViewCount());
//}
//
//sqlSession.close();
//}
//
//}
