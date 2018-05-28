package com.lxc.intro.microboot.upload.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.lxc.intro.microboot.upload.interceptor.MyInterceptor;
/**
 * @author L
 *定义MVC拦截器配置
 */
@Configuration
public class MyWebApplicationConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/*/*");//定义拦截规则
		super.addInterceptors(registry);
	}

}
