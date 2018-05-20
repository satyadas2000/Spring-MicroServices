package com.SpringZuulGateway.filters;

import com.netflix.zuul.ZuulFilter;

public class ErrorFilter extends ZuulFilter {

  @Override
  public String filterType() {
    return "error";
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