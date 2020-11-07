package com.eomcs.pms.filter;

import java.util.Map;
import com.eomcs.pms.handler.Request;

public interface CommandFilter {

  // 기존 구현체에 영향을 주지 않고 새 규칙을 추가하는 방법
  default void init(Map<String,Object> context) throws Exception {}

  void doFilter(Request request, FilterChain next) throws Exception;

  default void destroy() {}

}

