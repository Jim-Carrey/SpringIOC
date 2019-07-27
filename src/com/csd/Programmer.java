package com.csd;

public class Programmer {
	
	String name;
	
	int age;
	
	String language;
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Programmer [name=" + name + ", age=" + age + ", language=" + language + "]";
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	

}
