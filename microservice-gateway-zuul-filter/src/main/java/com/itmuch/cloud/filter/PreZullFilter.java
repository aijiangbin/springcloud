package com.itmuch.cloud.filter;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

import com.netflix.zuul.ZuulFilter;

public class PreZullFilter  extends ZuulFilter {
	
	private final Logger logger =  LoggerFactory.getLogger(PreZullFilter.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		logger.error("pre:::**********************************************************************");
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
