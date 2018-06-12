package com.itmuch.cloud;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigServiceController {
	
	@Value("${from}")
	private String from ;
	@Value("${serviceName}")
	private String serviceName ;
	@RequestMapping(value="/from")
	public Object from() {
		Map<String, Object> map = new HashMap<>();
		map.put("from", from);
		map.put("serviceName", serviceName);
		return map ;
	}

}
