package com.gokhantamkoc.springbootcrudlookup.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

@Configuration
public class AppConfig {
	
	@Autowired
	Environment environment;
	
	@Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
	
	@Bean
    public Mapper dozerMapper() {
        return DozerBeanMapperBuilder.buildDefault();
    }

	@Bean
	public String appName() {
		return environment.getProperty("app.name");
	}
	
	@Bean
	public String appVersion() {
		return environment.getProperty("app.version");
	}
	
	@Bean
	public String appCompany() {
		return environment.getProperty("app.company");
	}

	@Bean
	public String appMode() {
		return environment.getProperty("app.mode");
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
