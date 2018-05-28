package com.lxc.intro.microboot.email.config;
import java.util.concurrent.Executors;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
/**
 * 注册定时任务线程池
 * 
 * @author L
 */
@Configuration
public class TaskConfig implements SchedulingConfigurer {

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(Executors.newScheduledThreadPool(100));// 创建100百个线程池
	}

}
