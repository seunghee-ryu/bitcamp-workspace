package com.eomcs.pms.filter;

import java.util.ArrayList;
import java.util.Map;
import com.eomcs.pms.handler.Request;

public class CommandFilterManager implements FilterChain {
  ArrayList<CommandFilter> filters = new ArrayList<>();

  int nextFilterIndex = 0;

  public void add(CommandFilter filter) {
    filters.add(filter);
  }



  public void reset() {
    this.nextFilterIndex= 0 ;
  }

  public void init(Map<String,Object> context) throws Exception {
    for (CommandFilter filter : filters) {
      filter.init(context);
    }
  }

  public void destroy(){
    for (CommandFilter filter : filters) {
      filter.destroy();
    }
  }

  @Override
  public void doFilter(Request request) throws Exception {
    if (nextFilterIndex >= filters.size()) {
      return;
    }

    CommandFilter nextFilter = filters.get(nextFilterIndex++);
    nextFilter.doFilter(request, this);

  }


}
