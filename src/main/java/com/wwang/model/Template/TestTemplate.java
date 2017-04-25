package com.wwang.model.Template;

import java.util.ArrayList;
import java.util.List;

public class TestTemplate {

	public static void main(String[] args) {
		AbstractStudentGetter ageGetter = new AgeStudentGetter();
		AbstractStudentGetter nameGetter = new NameStudentGetter();
		 
		List<Student> students = new ArrayList<>();
		students.add(new Student("jim", 22));
		students.add(new Student("format", 25));
		 
		System.out.println(ageGetter.getStudent(students)); // Student(name=format, age=25)
		System.out.println(nameGetter.getStudent(students)); // Student(name=jim, age=22)
	}
}
