package com.lxc.intro.microboot.advance.service.impl;

import com.lxc.intro.microboot.advance.service.IMessageService;
//@Service
public class MessageServiceImpl implements IMessageService {
	@Override
	public String getMessage() {
		return "www.lxc.com";
	}
}
