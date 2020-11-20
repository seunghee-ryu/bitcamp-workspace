package com.eomcs.pms.service;

import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Project;

public interface ProjectService {
  int delete(int projectNo) throws Exception;
  int add(Project project) throws Exception;
  List<Project> list(String keyword) throws Exception;

  // ProjectListCommand가 Map 객체를 받는다?
  // List 오버로딩한다.
  //메서드의 파라미터 개수나 파라미터 타입이 다르더라도
  // 같은 기능을 수행한다면
  // 같은 이름을 부여함으로서 프로그래밍의 일관성을 유지하게 도와주는 문법
  List<Project> list(Map<String,Object> keywords) throws Exception;
  Project get(int no) throws Exception;
  int update(Project project) throws Exception;
}
