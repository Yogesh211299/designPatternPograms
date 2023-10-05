package com.jspiders.designpattern.main;

import com.jspiders.designpattern.creational.SingaltonLazy;

public class SingaltonLazyMain {
	public static void main(String[] args) {
		SingaltonLazy singaltonLazy1=SingaltonLazy.getObject();
		System.out.println(singaltonLazy1);
		SingaltonLazy singaltonLazy2=SingaltonLazy.getObject();
		System.out.println(singaltonLazy2);
		SingaltonLazy singaltonLazy3=SingaltonLazy.getObject();
		System.out.println(singaltonLazy3);
	}

}
