package com.lxc.intro.microboot;
/**
 * spring-boot启动类
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration
//@ComponentScan("com.lxc.intro.microboot")//表示扫描该路径下的controller
//spring-boot提供了更加方便的复合注解@@SpringBootApplication表示该类为spring-boot的启动类并且会自动扫描该类下面的子包
@SpringBootApplication
public class StartSpringBootMain {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(StartSpringBootMain.class, args);
	}
}