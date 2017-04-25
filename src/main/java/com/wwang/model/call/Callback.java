package com.wwang.model.call;

 /**
  * 学生回答老师答案
  * @author wangwei
  *
  */
public interface Callback {

	/**
	 * 学生思考完毕告诉老师答案
	 * @param answer
	 */
	public void tellAnswer(int answer);
	
}
