package com.hrp.spring.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class HRPConfig {
	
	@Autowired
	private Environment environment;
	
	private static HRPConfig hrpConfig = null;
	
	public static HRPConfig getInstance() {
		return hrpConfig;
	}
	
	public String getConfigValue(String configKey) {
		return environment.getProperty(configKey);
	}
	
	@PostConstruct
	public void initIt() throws Exception {
		hrpConfig = this;
	}

}
