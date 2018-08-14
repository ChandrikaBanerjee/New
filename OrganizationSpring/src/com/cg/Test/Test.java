package com.cg.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.organization.Organization;

public class Test {
	public static void main(String args[]) {
		
	
ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
Organization organization=(Organization) context.getBean("organization");

System.out.println(organization);
	}
}
