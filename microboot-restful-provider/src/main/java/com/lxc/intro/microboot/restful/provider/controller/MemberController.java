package com.lxc.intro.microboot.restful.provider.controller;

import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lxc.intro.microboot.restful.vo.Member;

@RestController
@RequestMapping("/member")
public class MemberController {
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Object add(@RequestBody Member member) {
		System.err.println("【member-add()】"+member);
		return true;
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Member add(@PathVariable(value="id") String id) {
		Member member = new Member();
		member.setAge(24);
		member.setName("liuxc1");
		member.setSalary(9999.99);
		member.setBirthDay(new Date());
		member.setId(id);
		return member;
	}
}
