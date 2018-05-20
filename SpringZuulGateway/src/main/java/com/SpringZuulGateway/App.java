package com.SpringZuulGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.SpringZuulGateway.filters.ErrorFilter;
import com.SpringZuulGateway.filters.PostFilter;
import com.SpringZuulGateway.filters.PreFilter;
import com.SpringZuulGateway.filters.RouteFilter;


/**
 * Hello world!
 *
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class App {
   public static void main(String[] args) {
      SpringApplication.run(App.class, args);
   }
   
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
  
}