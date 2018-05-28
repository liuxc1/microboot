package com.lxc.intro.microboot.advance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
	@RequestMapping("/show")
	public String show(Model model,String name){
		System.out.println("--------------------");
		model.addAttribute("url", "www.lxc.com");
		model.addAttribute("name", name);
		return "simplen/thymeleaf_show"; //thymeleaf 模板默认的页面后缀是.html 但可以在application.yml中配置后缀（但是一般使用thymeleaf都是使用默认的html后缀）
	}
}
