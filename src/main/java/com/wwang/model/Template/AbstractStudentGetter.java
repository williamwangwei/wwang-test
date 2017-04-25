package com.wwang.model.Template;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public abstract class AbstractStudentGetter {
    public final Student getStudent(List<Student> students) {
        sort(students); // 第一步
        if( students != null ) {
            return students.get(0);  // 第二步
        }
        return null;
    }
    abstract public void sort(List<Student> students);
}

class AgeStudentGetter extends AbstractStudentGetter { // 取出年纪最大的学生
    @Override
    public void sort(List<Student> students) {
    	
    	Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getAge() - s1.getAge();
            }
        });
    }
}

class NameStudentGetter extends AbstractStudentGetter { // 按照名字字母排序取出第一个学生
    @Override
    public void sort(List<Student> students) {
    	
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getName().compareTo(s1.getName());
            }
        });;
    }
}	
