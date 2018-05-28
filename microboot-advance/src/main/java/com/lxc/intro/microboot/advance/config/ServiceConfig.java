package com.lxc.intro.microboot.advance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lxc.intro.microboot.advance.service.IMessageService;
import com.lxc.intro.microboot.advance.service.impl.MessageServiceImpl;

@Configuration
public class ServiceConfig {
	@Bean(name="messageServiceImpl2")   //此出配置低价与xml的<bean></bean>配置
	public IMessageService getMessageService(){
		
		return new MessageServiceImpl();
	}
}
