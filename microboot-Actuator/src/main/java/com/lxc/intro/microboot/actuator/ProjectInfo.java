package com.lxc.intro.microboot.actuator;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class ProjectInfo implements InfoContributor {
	@Override
	public void contribute(Builder arg0) {
		arg0.withDetail("version", "1.010.0");
		arg0.withDetail("auth", "lxc");
		arg0.build();
	}

}
