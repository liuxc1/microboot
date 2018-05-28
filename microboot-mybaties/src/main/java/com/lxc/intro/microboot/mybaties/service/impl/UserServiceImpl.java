package com.lxc.intro.microboot.mybaties.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxc.intro.microboot.mybaties.dao.IUserDao;
import com.lxc.intro.microboot.mybaties.service.IUserService;
import com.lxc.intro.microboot.mybaties.vo.User;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao dao;

	@Override
	public List<User> findAll() {

		return dao.findAll();
	}

	@Override
	public int insert(User user) {
		
		return dao.insert(user);
	}

}
