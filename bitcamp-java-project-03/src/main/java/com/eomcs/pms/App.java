package com.eomcs.pms;

public class App {

  public static void main(String[] args) {
    
    // 콘솔에서 사용자의 입력을 처리하는 도구를 준비한다.
    // => 키보드 input stream : System.in
    // => input stream에서 data을 읽어 적절한 타입으로 return하는 도구 : Scanner
    //new java.io.BufferedInputStream(System.in);
    //new java.io.DataInputStream(System.in);
    java.util.Scanner KeyInput = new java.util.Scanner(System.in);
    
    
    System.out.println("[회원]");
    System.out.print("번호? ");
    int no = KeyInput.nextInt();//nextInt();는 입력값 중에 숫자만 뽑아간다.
    KeyInput.nextLine();//숫자 뒤에 남아있는 cr/lf값 읽어서 버리기.
    
    System.out.print("이름? ");
    String name = KeyInput.nextLine();
    
    System.out.print("이메일? ");
    String email = KeyInput.nextLine();
    
    System.out.print("암호? ");
    String password = KeyInput.nextLine();
    
    System.out.print("사진? ");
    String photo = KeyInput.nextLine();
    
    System.out.print("전화? ");
    String tel = KeyInput.nextLine();
    
    long currentMillis = System.currentTimeMillis(); //1970-01-01 00:00:00에서부터 경과된 밀리 초를 리
    java.sql.Date now = new java.sql.Date(currentMillis); 
    
    
    KeyInput.close();
    
    System.out.println("------------------------");
    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", email);
    System.out.printf("암호: %s\n", password);
    System.out.printf("사진: %s\n", photo);
    System.out.printf("전화: %s\n", tel);
    System.out.printf("가입일: %s\n", now.toString());
    
  }
}
