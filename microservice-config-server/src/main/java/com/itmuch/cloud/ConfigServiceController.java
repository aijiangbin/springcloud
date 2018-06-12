package com.itmuch.cloud;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigServiceController {
	
	@Value("${password}")
	private String password ;
	@RequestMapping(value="/password")
	public Object from() {
		Map<String, Object> map = new HashMap<>();
		map.put("password", password);
		return map ;
	}

}
