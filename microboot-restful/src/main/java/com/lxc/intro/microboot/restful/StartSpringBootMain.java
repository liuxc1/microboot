package com.lxc.intro.microboot.restful;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
@SpringBootApplication
public class StartSpringBootMain extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(StartSpringBootMain.class);
	}
	public static void main(String[] args) throws Exception {
		
		SpringApplication.run(StartSpringBootMain.class, args);
	}
}