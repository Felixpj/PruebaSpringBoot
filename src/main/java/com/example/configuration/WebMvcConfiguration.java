package com.example.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.component.RequestTimeInterceptor;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurationSupport{

	@Autowired
	@Qualifier("requestTimeInterceptor")
	private RequestTimeInterceptor rti; 
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(rti);
	}

}
