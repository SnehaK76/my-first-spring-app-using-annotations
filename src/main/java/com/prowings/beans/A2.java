package com.prowings.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class A2 {
	
	@Value(value = "2000")
	private int b;
	
	public A2() {
		super();
	}

	
    public A2(int b) {
		super();
		this.b = b;
	}


    @Override
	public String toString() {
		return "A2 [b=" + b + "]";
	}
	
	
	
}
