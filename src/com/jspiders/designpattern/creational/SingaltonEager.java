package com.jspiders.designpattern.creational;

public class SingaltonEager {
   
	private static SingaltonEager singaltonEager=new SingaltonEager();
	
    private SingaltonEager() {
    	
    }
	
    
    public static SingaltonEager getObject() {
    	return singaltonEager;
    }
}
