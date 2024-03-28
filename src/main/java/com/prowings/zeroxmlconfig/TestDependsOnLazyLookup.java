package com.prowings.zeroxmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestDependsOnLazyLookup {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaBaseConfig.class);
		
		A a = context.getBean("beanA", A.class);
		System.out.println(a);
		B b = context.getBean("beanB", B.class);
		System.out.println(b);
		
//		-----------@Lazy--------------------
		
		P p = context.getBean("p", P.class);
		Q q = context.getBean("q", Q.class);
		
		System.out.println(p);
		System.out.println(q);
		
//		----------------@Lookup-------------
		
		SingletonBean bean = context.getBean(SingletonBean.class);
		bean.usePrototype();
		
		SingletonBean bean2 = context.getBean(SingletonBean.class);
		bean2.usePrototype();
	}
}
