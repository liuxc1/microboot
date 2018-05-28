package com.lxc.intro.microboot.error.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorPageConfig {
	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer(){
		return new EmbeddedServletContainerCustomizer(){
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				ErrorPage errorPage_400=new ErrorPage(HttpStatus.BAD_REQUEST,"/error/error_400.html");
				ErrorPage errorPage_404=new ErrorPage(HttpStatus.NOT_FOUND,"/error/error_404.html");
				//ErrorPage errorPage_500=new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error/error_500.html");
				//加入错误的容器中
				//container.addErrorPages(errorPage_400,errorPage_404,errorPage_500);
				container.addErrorPages(errorPage_400,errorPage_404);
			}};
	}
}
