package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.itmuch.cloud.filter.PreZullFilter;

@SpringBootApplication
@EnableZuulProxy
//@EnableEurekaServer
public class ZullFilterApplication {
  public static void main(String[] args) {
    SpringApplication.run(ZullFilterApplication.class, args);
  }
  
  @Bean
  public PreZullFilter  getPreZullFilter() {
	  return  new PreZullFilter();
  }
}
