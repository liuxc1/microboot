package com.lxc.intro.microboot.mybaties.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lxc.intro.microboot.mybaties.vo.User;

public interface IUserService {
	@Transactional(readOnly=true)//只读接口
	List<User> findAll();
	@Transactional(propagation=Propagation.REQUIRED)
	int insert(User user);
}
