package com.prowings.xmlannotationcombi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@Component
public class BeansConfig {
	
	@Bean(name = "bus1")
	public Bus getBus1() {
		return new Bus(111, "TATA", "Electric Bus");
	}
	
	@Bean(name = "bus2")
	public Bus getBus2() {
		return new Bus(222, "VOLVO", "Petrol");
	}
}
