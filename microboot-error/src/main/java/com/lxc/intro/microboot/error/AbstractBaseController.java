package com.lxc.intro.microboot.error;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public abstract class AbstractBaseController {
	@InitBinder
	public void initBinder(WebDataBinder binder){
		//创建一个将字符串格式化为日期的工具类
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		//明确此时处理日期格式化的转换类
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(format, true));
	}
}
