package com.eomcs.pms.service;

import java.util.List;
import java.util.Map;
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.domain.Project;
import com.eomcs.util.SqlSessionFactoryProxy;

public class DefaultProjectService implements ProjectService {

  ProjectDao projectDao;
  TaskDao taskDao;
  SqlSessionFactoryProxy factoryProxy;

  public DefaultProjectService(
      ProjectDao projectDao,
      TaskDao taskDao,
      SqlSessionFactoryProxy factoryProxy) {
    this.projectDao = projectDao;
    this.taskDao = taskDao;
    this.factoryProxy = factoryProxy;
  }


  @Override
  public int delete(int no) throws Exception {
    try {
      // 트랜잭션 시작
      factoryProxy.startTransaction();
      // 프로젝트에 소속된 모든 작업 삭제하기
      taskDao.deleteByProjectNo(no);
      // 프로젝트에 소속된 모든 멤버 삭제하기
      projectDao.deleteMembers(no);
      // 프로젝트 삭제하기
      int count = projectDao.delete(no);
      // 트랜잭션 작업이 성공하였다면 커밋
      factoryProxy.commit();
      return count;

    } catch (Exception e) {
      // 트랜잭션 작업 도중에 예외가 발생하면 롤백
      factoryProxy.rollback();
      // 서비스 객체에서 발생한 예외는 호출자에게 전달한다.
      throw e;

    } finally {
      // 트랜잭션 종료
      factoryProxy.endTransaction();
    }
  }

  @Override
  public int add(Project project) throws Exception {
    projectDao.insert(project);
    return 1;
  }

  @Override
  public List<Project> list(String keyword) throws Exception {
    // 이 메서드를 보면 서비스 객체가 할 일이 없다.
    // 그냥 Dao 객체의 메서드를 호출한 다음에 리턴값을
    // 그대로 리턴해주는 일을 한다.
    // 그럼 왜 이런 메서드를 만들어야 하는가?
    // => 프로그래밍의 일관성을 위해서다
    // => 커맨드 객체가 상황에 따라 Service 객체를 쓰거나 Dao 객체를 써야 한다면
    //    프로그래밍의 일관성이 없어서 유지보수 하기가 어렵다.
    // => 커맨드 객체가 서비스 객체를 사용하기로 했으면
    //    어떤 작업을 수행하든간에 일관되게 서비스 객체를 사용하는 것이
    //    유지보수하기에 더 낫다.
    // => 그래서 이런 메서드를 만드는 것이다.
    //    즉, 서비스 객체의 메서드에서 특별히 할 일이 없다 하더라도
    //    커맨드 객체가 일관성 있게 작업을 수행할 수 있도록
    //    중간에서 Dao 객체의 메서드를 호출해주는 것이다.
    return projectDao.findAll(keyword);
  }

  @Override
  public List<Project> list(Map<String, Object> keywords) throws Exception {
    return projectDao.findByDetailKeyword(keywords);
  }

  @Override
  public Project get(int no) throws Exception {
    return projectDao.findByNo(no);
  }

  @Override
  public int update(Project project) throws Exception {
    return projectDao.update(project);
  }
}

