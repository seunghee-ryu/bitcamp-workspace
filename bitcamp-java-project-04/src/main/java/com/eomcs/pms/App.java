package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;


public class App {
  public static void main(String[] args) {
    System.out.println("[회원]");
    
    Scanner KeyboardScan = new Scanner(System.in);
    
    int no1 = 0, no2 = 0, no3 = 0, no4 = 0, no5 = 0;
    String name1 = " ", name2 = " ", name3 = " ", name4 = " ", name5 = " '";
    String email1 = " ", email2 = " ", email3 = " ", email4 = " ", email5 = " ";
    String pw1 = " ", pw2 = " ", pw3 = " ", pw4 = " ", pw5 = " ";
    String photo1 = " ", photo2 = " ", photo3 = " ", photo4 = " ", photo5 = " ";
    String tel1 = " ", tel2 = " ", tel3 = " ", tel4 = " ", tel5 = " ";
    Date regiDate1 = null, regiDate2 = null, regiDate3 = null, regiDate4 = null, regiDate5 = null;
    
    long currentMills;
    int count = 1;
    
    System.out.print("번호? ");
    no1 = Integer.parseInt(KeyboardScan.nextLine());
    
    System.out.print("이름? ");
    name1 = KeyboardScan.nextLine();
    
    System.out.print("이메일? ");
    email1 = KeyboardScan.nextLine();
    
    System.out.print("패스워드? ");
    pw1 = KeyboardScan.nextLine();
    
    System.out.print("사진? ");
    photo1 = KeyboardScan.nextLine();
    
    System.out.print("전화? ");
    tel1 = KeyboardScan.nextLine();
    
    regiDate1 = new java.sql.Date(System.currentTimeMillis());
    System.out.println();
    
    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String response = KeyboardScan.nextLine();
    
    if (response.equalsIgnoreCase("y")) {
      count = count + 1;
      //2
      
      System.out.print("번호? ");
      no2 = Integer.parseInt(KeyboardScan.nextLine());
      
      System.out.print("이름? ");
      name2 = KeyboardScan.nextLine();
      
      System.out.print("이메일? ");
      email2 = KeyboardScan.nextLine();
      
      System.out.print("패스워드? ");
      pw2 = KeyboardScan.nextLine();
      
      System.out.print("사진? ");
      photo2 = KeyboardScan.nextLine();
      
      System.out.print("전화? ");
      tel2 = KeyboardScan.nextLine();
      
      regiDate2 = new java.sql.Date(System.currentTimeMillis());
      System.out.println();
      
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      response = KeyboardScan.nextLine();
      
      if (response.equalsIgnoreCase("y")) {
        count = count + 1;
        //3
        
        System.out.print("번호? ");
        no3 = Integer.parseInt(KeyboardScan.nextLine());
        
        System.out.print("이름? ");
        name3 = KeyboardScan.nextLine();
        
        System.out.print("이메일? ");
        email3 = KeyboardScan.nextLine();
        
        System.out.print("패스워드? ");
        pw3 = KeyboardScan.nextLine();
        
        System.out.print("사진? ");
        photo3 = KeyboardScan.nextLine();
        
        System.out.print("전화? ");
        tel3= KeyboardScan.nextLine();
        
        regiDate3 = new java.sql.Date(System.currentTimeMillis());
        System.out.println();
        
        System.out.print("계속 입력하시겠습니까?(y/N) ");
        response = KeyboardScan.nextLine();
        
        if (response.equalsIgnoreCase("y")) {
        
          count = count + 1;
          
          //4
          
          System.out.print("번호? ");
          no4 = Integer.parseInt(KeyboardScan.nextLine());
          
          System.out.print("이름? ");
          name4 = KeyboardScan.nextLine();
          
          System.out.print("이메일? ");
          email4 = KeyboardScan.nextLine();
          
          System.out.print("패스워드? ");
          pw4 = KeyboardScan.nextLine();
          
          System.out.print("사진? ");
          photo4 = KeyboardScan.nextLine();
          
          System.out.print("전화? ");
          tel4 = KeyboardScan.nextLine();
          
          regiDate4 = new java.sql.Date(System.currentTimeMillis());
          System.out.println();
          
          System.out.print("계속 입력하시겠습니까?(y/N) ");
          response = KeyboardScan.nextLine();
          
          if (response.equalsIgnoreCase("y")) {
            count = count + 1;
            
            //5
            
            System.out.print("번호? ");
            no5 = Integer.parseInt(KeyboardScan.nextLine());
            
            System.out.print("이름? ");
            name5 = KeyboardScan.nextLine();
            
            System.out.print("이메일? ");
            email5 = KeyboardScan.nextLine();
            
            System.out.print("패스워드? ");
            pw5 = KeyboardScan.nextLine();
            
            System.out.print("사진? ");
            photo5 = KeyboardScan.nextLine();
            
            System.out.print("전화? ");
            tel5 = KeyboardScan.nextLine();
            
            regiDate5 = new java.sql.Date(System.currentTimeMillis());
            System.out.println();
          }
          
          
        }
        
      }
      
      
      
    }
    
    
    
    KeyboardScan.close();
    
    System.out.println("--------------------");
    
    if (count >=1)
    System.out.printf("%d, %s, %s, %s, %s\n", 
        no1, name1, email1, tel1, regiDate1.toString());
    if (count >=2) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no2, name2, email2, tel2, regiDate2.toString());
      if (count >=3) {
        System.out.printf("%d, %s, %s, %s, %s\n", 
            no3, name3, email3, tel3, regiDate3.toString());
        if (count >=4) {
          System.out.printf("%d, %s, %s, %s, %s\n", 
              no4, name4, email4, tel4, regiDate4.toString());
          if (count >=5) {
            System.out.printf("%d, %s, %s, %s, %s\n", 
                no5, name5, email5, tel5, regiDate5.toString());
            
          }
          
        }
        
      }
      
    }
  }
}