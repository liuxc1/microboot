package com.lxc.intro.microboot.advance.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxc.intro.microboot.advance.service.IMessageService;
import com.lxc.intro.microboot.advance.util.AbstractBaseController;

/**
 * 3.2读取资源文件信息
 */
@RestController
@RequestMapping("/message")
public class MessageController extends AbstractBaseController {
	@Resource(name="messageServiceImpl2")
	private IMessageService messageService;

	@RequestMapping("/echo")
	public String echo(String name) {
		System.out.println("**读取路径：" + super.get("Add"));
		return super.get("Welcome.msg", name);
	}

	@RequestMapping("/index")
	public String index() {
		System.out.println("xxxxxxxxxxxxxxxx");
		return this.messageService.getMessage();
	}
}
