package com.lxc.intro.microboot.email.task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.lxc.intro.microboot.email.service.IUserService;

@Component
public class TimeTask {
	@Autowired
	private IUserService userService;

	@Scheduled(fixedRate = 1000) // 间隔执行
	public void runJobA() {
		userService.println();
	}
	
	@Scheduled(cron="*/3 * * * * ?") 
	public void runJobB() {
		userService.println2();
	}
}
