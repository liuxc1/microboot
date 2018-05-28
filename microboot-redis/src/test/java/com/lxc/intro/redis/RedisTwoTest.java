package com.lxc.intro.redis;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.lxc.intro.microboot.redis.domain.User;

@SpringBootTest(classes = com.lxc.intro.microboot.StartSpringBootMain.class)
@RunWith(value = SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class RedisTwoTest {
	@Resource(name = "redisTwo")
	private RedisTemplate<String, Object> template;
	@Test
	public void save() throws Exception {
		User user = new User();
		user.setAge(24);
		user.setName("liuxc");
		user.setSex(false);
		user.setBirthDay(new Date());
		template.opsForValue().set("user", user);
	}
	/**
	 * 获取
	 */
	@Test
	public void get() throws Exception {
		Object object = template.opsForValue().get("user");
		System.out.println(object);
	}
}
