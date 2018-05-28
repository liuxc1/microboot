package com.lxc.intro.microboot.restful.consumber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.lxc.intro.microboot.restful.vo.Member;

@Controller
@RequestMapping("/consumber")
public class RestConsumberController {
	@Autowired
	private RestTemplate restTemplate;

	@ResponseBody
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Boolean add(Member member) {
		Boolean flag = restTemplate.postForObject("http://localhost:8080/member/add", member, Boolean.class);
		return flag;
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String get(String id, Model mdeol) {
		System.out.println("xxxxxxxxxxxxxxxxxxxxxx");
		Member member = restTemplate.getForObject("http://localhost:8080/member/get/" + id, Member.class);
		mdeol.addAttribute("member", member);
		return "member_show";
	}
}
