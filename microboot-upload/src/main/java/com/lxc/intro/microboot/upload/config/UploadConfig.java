package com.lxc.intro.microboot.upload.config;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UploadConfig {
	@Bean
	public MultipartConfigElement getMultipartConfig(){
		MultipartConfigFactory onfigFactory=new MultipartConfigFactory();
		onfigFactory.setLocation("/");
		onfigFactory.setMaxFileSize("2MB");
		onfigFactory.setMaxRequestSize("10MB");
		return onfigFactory.createMultipartConfig();
	}
}
