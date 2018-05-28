package com.lxc.intro.microboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // 为复合注解
// @Controller
public class HelloController {
	@RequestMapping("/")
	// @ResponseBody
	String home() {
		return "com.lxc.spring-boot hello!";
	}

	/**
	 * 路径访问，使用标准的restfull风格接受参数 
	 * http://localhost:8080/sum/1/2
	 */
	@RequestMapping(value = "/sum/{a}/{b}", method = RequestMethod.GET)
	int sun(@PathVariable(name = "a") int a, @PathVariable(name = "b") int b) {
		return a* b;
	}

	/**
	 * 使用地址重写的方式传递参数
	 * http://localhost:8080/echo?message=hello
	 */
	@RequestMapping("/echo")
	String echo(String message) {
		return "【echo】+" + message;
	}
	/**
	 *9. 获取内置对象
	 */
	@RequestMapping
	public String object(HttpServletRequest request,HttpServletResponse response){
		System.out.println("**获取请求的IP地址："+request.getRemoteAddr());
		System.out.println("**获取SessionID"+request.getSession().getId());
		System.out.println("**获取项目的真实路径"+request.getServletContext().getRealPath("/"));
		System.out.println("**获取响应的编码"+request.getCharacterEncoding());
		
		
		
		return "获取内置对象";
	}
	
}
