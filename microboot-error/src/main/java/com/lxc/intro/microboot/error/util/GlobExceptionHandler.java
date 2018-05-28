package com.lxc.intro.microboot.error.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常的处理类
 */
@ControllerAdvice // 作为一个控制层的切面处理
public class GlobExceptionHandler {
	public static final String DEFAULT_ERROR_VIEW = "error"; // 定义一个全局异常处理页面的路径
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Object defaultErrorHandler(HttpServletRequest request, Exception e) {
		Map<String,Object> result=new HashMap<>();
		result.put("url", request.getRequestURL());
		result.put("message", e.getMessage());
		
		return result;
	}
	/*
	 * 1.
	 * @ExceptionHandler(value = Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) {
		ModelAndView mv = new ModelAndView(DEFAULT_ERROR_VIEW);
		mv.addObject("e",e);
		mv.addObject("url", request.getRequestURL());
		return mv;
	}*/
}
