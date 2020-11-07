package com.eomcs.pms.filter;

import com.eomcs.pms.handler.Request;

class Filter1 implements CommandFilter {

  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    System.out.println("Filter1 ==> ");
    next.doFilter(request);
    System.out.println(" <== Filter1");
  }

}

class Filter2 implements CommandFilter {

  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    System.out.println("Filter2 ==> ");
    next.doFilter(request);
    System.out.println(" <== Filter2");
  }

}

class Filter3 implements CommandFilter {

  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    System.out.println("Filter3 ==> ");
    next.doFilter(request);
    System.out.println(" <== Filter3");
  }

}

public class test1 {

  public static void main(String[] args) {
    CommandFilterManager filterManager = new CommandFilterManager();
    filterManager.add(new Filter1());
    filterManager.add(new Filter2());
    filterManager.add(new Filter3());
    try {
      filterManager.doFilter(null);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
