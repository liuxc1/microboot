package com.lxc.intro.microboot.mybaties;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes=com.lxc.intro.microboot.mybaties.StartSpringBootMain.class)
@RunWith(value=SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDataSource {
	@Autowired
	private DataSource dataSource;
	@Test
	public void testConnect() throws Exception {
		System.out.println(dataSource);
	}
}
