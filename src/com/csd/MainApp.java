package com.csd;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Programmer programmer= (Programmer) context.getBean("programmer");
		System.out.println(programmer);
		
	}

}
