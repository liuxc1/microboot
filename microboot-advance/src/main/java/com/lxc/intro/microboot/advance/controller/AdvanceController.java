package com.lxc.intro.microboot.advance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 3.1  深入配置
 *
 */
@Controller
@RequestMapping("/Advance")
public class AdvanceController {
	@ResponseBody
	@RequestMapping("/")
	public String index(){
		
		return "index";
	}
}
