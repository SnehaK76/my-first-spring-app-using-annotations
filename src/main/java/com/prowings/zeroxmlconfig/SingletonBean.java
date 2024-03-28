package com.prowings.zeroxmlconfig;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
	
	public void usePrototype() {
		PrototypeBean dependency = createPrototypeDependency();
		dependency.doSomething();
	}
	
	@Lookup
	protected PrototypeBean createPrototypeDependency() {
		return null;
	}
}
