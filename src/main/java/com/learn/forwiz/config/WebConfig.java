package com.learn.forwiz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("http://localhost:8080", "http://localhost:8081")
				.allowCredentials(true)
				.allowedMethods("GET", "POST")
				.allowedHeaders("*");
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/thumbnail_images/**") 		// URL 패턴
				.addResourceLocations("file:c:/thumbnail_images/"); // 로컬 폴더 경로
	}
}
