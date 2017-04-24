package com.wwang.call;

public class Teacher implements Callback {
	private Student student;
	
	public Teacher(Student student) {
        this.student = student;
    }
 
	/**
	 * 向学生问问题
	 */
    public void askQuestion() {
        student.resolveQuestion(this);
    }
	
    /**
     * 学生回答完毕问题之后，老师要做的事情
     */
	@Override
	public void tellAnswer(int answer) {
		System.out.println("知道了，你的答案是" + answer);
	}

}
