package com.lxc.intro.microboot.upload.service;

import com.lxc.intro.microboot.upload.domain.User;

public interface IMemberService {
	User get(String id);
	
	void printlt();
}
