package com.prowings.zeroxmlconfig;

public class A {
	
	private int id;
	private String name;
	
	public A() {
		System.out.println("Inside A's no arg constructor");
	}

	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}
	
	
}
