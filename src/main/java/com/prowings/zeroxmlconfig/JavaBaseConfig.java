package com.prowings.zeroxmlconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.prowings.zeroxmlconfig")
public class JavaBaseConfig {
	
//	@Bean(name = "bike2")
//	public Bike getBike() {
//		Bike bike = new Bike();
//		bike.setId(555);
//		bike.setName("TVS");
//		bike.setType("Regular Bike");
//		return bike;
//	}
	
	@Bean(initMethod = "myInit")
	@Scope("prototype")
	public Bus getBus() {
		Bus b = new Bus();
		b.setId(333);
		b.setCompany("TATA-NEW");
		b.setType("Travller");
		return b;
	}
	
	@Bean
	public Engine getEngine() {
		Engine e = new Engine();
		e.setId(777);
		e.setName("V12");
		return e;
	}
}
