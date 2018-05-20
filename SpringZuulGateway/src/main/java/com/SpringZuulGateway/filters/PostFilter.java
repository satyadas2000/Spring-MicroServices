package com.SpringZuulGateway.filters;

import com.netflix.zuul.ZuulFilter;

public class PostFilter extends ZuulFilter {

  @Override
  public String filterType() {
    return "post";
  }

  @Override
  public int filterOrder() {
    return 1;
  }


  public boolean shouldFilter() {
    return true;
  }


  public Object run() {
   System.out.println("Inside Response Filter");

    return null;
  }

}