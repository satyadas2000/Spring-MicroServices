package com.SpringZuulGateway.filters;

import com.netflix.zuul.ZuulFilter;

public class RouteFilter extends ZuulFilter {

  @Override
  public String filterType() {
    return "route";
  }

  @Override
  public int filterOrder() {
    return 1;
  }


  public boolean shouldFilter() {
    return true;
  }


  public Object run() {
   System.out.println("Inside Route Filter");

    return null;
  }

}