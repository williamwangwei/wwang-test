package com.wwang.model.Template;

public class Student {
	private int age;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student( String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
