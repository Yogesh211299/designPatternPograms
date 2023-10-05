package com.jspiders.designpattern.main;

import com.jspiders.designpattern.creational.Contact;
import com.jspiders.designpattern.creational.ContactBuilder;

public class ContactMain {
    public static void main(String[] args) {
		Contact contact=new ContactBuilder().firstName("yogi").lastName("kale").mobileNumber(9145678507l).age(23).getContact();
		System.out.println(contact);
	}
}
