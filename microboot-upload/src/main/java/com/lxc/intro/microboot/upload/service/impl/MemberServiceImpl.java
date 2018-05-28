package com.lxc.intro.microboot.upload.service.impl;

import org.springframework.stereotype.Service;

import com.lxc.intro.microboot.upload.domain.User;
import com.lxc.intro.microboot.upload.service.IMemberService;
@Service
public class MemberServiceImpl implements IMemberService {

	@Override
	public User get(String id) {
		User user=new User();
		user.setId(id);
		user.setName("xxxx");
		return user;
	}

	@Override
	public void printlt() {
		System.err.println("MemberServiceImpl_println");
		
	}

}
