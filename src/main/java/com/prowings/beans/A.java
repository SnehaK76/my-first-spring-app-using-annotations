package com.prowings.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class A {
	
	@Value(value = "2000")
	private int a;

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
	
	
}
