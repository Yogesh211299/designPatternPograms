package com.jspiders.designpattern.main;

import com.jspiders.designpattern.creational.SingaltonEager;

public class SingaltonEagerMain {

	 public static void main(String[] args) {
		SingaltonEager singaltonEager1=SingaltonEager.getObject();
		System.out.println(singaltonEager1);
		SingaltonEager singaltonEager2=SingaltonEager.getObject();
		System.out.println(singaltonEager2);
		SingaltonEager singaltonEager3=SingaltonEager.getObject();
		System.out.println(singaltonEager3);
	}
}
