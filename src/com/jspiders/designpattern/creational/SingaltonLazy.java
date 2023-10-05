package com.jspiders.designpattern.creational;

public class SingaltonLazy {

	private static SingaltonLazy singaltonLazy;
	
	private SingaltonLazy() {
		System.out.println("constructer accessed");
	}
	
	public static SingaltonLazy getObject() {
		if (singaltonLazy == null) {
			singaltonLazy = new SingaltonLazy();
		}
		return singaltonLazy;
	}
}
