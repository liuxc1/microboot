package com.lxc.intro.microboot.mybaties;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.lxc.intro.microboot.mybaties.service.IUserService;
import com.lxc.intro.microboot.mybaties.vo.User;

@SpringBootTest(classes=com.lxc.intro.microboot.mybaties.StartSpringBootMain.class)
@RunWith(value=SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class UserTest {
	@Autowired
	private IUserService service;
	
	@Test
	public void testList() throws Exception {
		List<User> findAll = service.findAll();
		System.out.println(findAll);
	}
	
	@Test
	public void testInsert() throws Exception {
		User user=new User();
		user.setName("love xx");
		int i = service.insert(user);
		System.err.println(i);
	}
}
