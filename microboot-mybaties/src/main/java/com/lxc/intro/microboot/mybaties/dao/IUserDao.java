package com.lxc.intro.microboot.mybaties.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lxc.intro.microboot.mybaties.vo.User;

@Mapper
public interface IUserDao {
	List<User> findAll();

	int insert(User user);
}
