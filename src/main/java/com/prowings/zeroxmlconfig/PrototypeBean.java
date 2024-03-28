package com.prowings.zeroxmlconfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean{
	
	public void doSomething() {
		System.out.println("PrototypeDependency instance: "+this.hashCode());
	}
}
