package com.jspiders.designpattern.main;

import java.util.Scanner;

import com.jspiders.designpattern.creational.Beverage;
import com.jspiders.designpattern.creational.BlackTea;
import com.jspiders.designpattern.creational.GreenTea;
import com.jspiders.designpattern.creational.IceTea;
import com.jspiders.designpattern.creational.NormalTea;

public class TeaFactory {
  public static Beverage beverage;
   
  public static void main(String[] args) {
	try {
		factory().order();
	} catch (NullPointerException e) {
		e.printStackTrace();
	}
}
  
   public static Beverage factory() {
	   System.out.println("1.NormalTea\n2.GreenTea\n3.BlackTea\n4.IceTea\n");
	   System.out.println("select your tea ");
	   Scanner scanner = new Scanner(System.in);
	   int choice=scanner.nextInt();
	   scanner.close();
	   switch(choice) {
	   case 1: beverage=new NormalTea();break;
	   case 2: beverage=new GreenTea();break;
	   case 3: beverage=new BlackTea();break;
	   case 4: beverage=new IceTea();break;
	   default: System.out.println("invalid choice");
	   }
	   return beverage;
   }
}
