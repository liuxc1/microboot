package com.lxc.intro.microboot.mybaties.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxc.intro.microboot.mybaties.service.IUserService;

@RestController
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/list")
	public Object list() {

		return userService.findAll();
	}
}
