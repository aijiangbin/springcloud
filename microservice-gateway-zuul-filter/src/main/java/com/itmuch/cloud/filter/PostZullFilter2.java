package com.itmuch.cloud.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.netflix.zuul.ZuulFilter;

@Service
public class PostZullFilter2  extends ZuulFilter {
	
	private final Logger logger =  LoggerFactory.getLogger(PostZullFilter2.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		logger.error("post::-1111111111:**********************************************************************");
		return null;
	}

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return -1;
	}

}
