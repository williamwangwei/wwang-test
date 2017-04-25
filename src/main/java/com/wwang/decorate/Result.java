package com.wwang.decorate;

//查询结果类，相当于一个domain
public class Result {
	
	 private Object obj;
	 private String sql;
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
	
	public Result(Object obj, String sql) {
		super();
		this.obj = obj;
		this.sql = sql;
	}
	@Override
	public String toString() {
		return "Result [obj=" + obj + ", sql=" + sql + "]";
	}
	 
	 
}
