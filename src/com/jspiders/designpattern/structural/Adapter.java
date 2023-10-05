package com.jspiders.designpattern.structural;

public class Adapter extends Employee implements Event  {

	@Override
	public void womensDay(Adapter adapter) {
		
	adapter.setId(1);
	adapter.setName("yogita");
	adapter.setEmail("yogita@gmail.com");
	System.out.println("Chief guest  for the womens day is  "+adapter.getName());
	}
	
	
	
	@Override
	public void mensDay(Adapter adapter) {
		adapter.setId(2);
		adapter.setName("yogi");
		adapter.setEmail("yogi@gmail.com");
		System.out.println("Chief guest  for the womens day is  "+adapter.getName());		
		       
	}
}
