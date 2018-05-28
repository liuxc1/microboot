package com.lxc.intro.microboot.upload.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {
	
	public MyInterceptor() {
		System.out.println("拦截器构造方法。。。。。："+MyInterceptor.class);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("拦截器处理完成后。。。。。。。。。。。。。。");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)throws Exception {
		System.out.println("拦截器处理中："+arg3);
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("进入拦截器进行处理--------------"+arg2.getClass()+"------------------");
		HandlerMethod method=(HandlerMethod)arg2;
		System.out.println(method.getBean().getClass());
		System.out.println(method.getMethod().getName());
		return true;
	}

}
