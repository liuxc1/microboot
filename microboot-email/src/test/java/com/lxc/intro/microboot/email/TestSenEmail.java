package com.lxc.intro.microboot.email;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@WebAppConfiguration
@SpringBootTest(classes = com.lxc.intro.microboot.email.StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSenEmail {
	@Autowired
	private JavaMailSender javaMailSender;
	@Test
	public void testEmail() throws Exception {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("921119098@qq.com");// 用户邮箱
		message.setTo("839542873@qq.com");// 接受邮箱
		message.setSubject("测试邮件发送");
		message.setText("测试邮件发送!!!!");
		javaMailSender.send(message);
	}
}
