package com.jspiders.designpattern.creational;

public class IceTea implements Beverage {
    @Override
    public void order() {
         System.out.println("IceTea is ordered");
    }
}
