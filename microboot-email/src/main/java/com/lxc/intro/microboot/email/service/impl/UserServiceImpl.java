package com.lxc.intro.microboot.email.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.lxc.intro.microboot.email.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Override
	public void println() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("********println1******:" + simpleDateFormat.format(new Date()));
	}

	@Override
	public void println2() {
		System.out.println("********println2******:" + simpleDateFormat.format(new Date()));
	}

}
