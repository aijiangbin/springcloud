package com.itmuch.cloud.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;

@Configuration
@Component
public class PostZullFilter  extends ZuulFilter {
	
	private final Logger logger =  LoggerFactory.getLogger(PostZullFilter.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		logger.error("post::-0000000:**********************************************************************");
		return null;
	}

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
