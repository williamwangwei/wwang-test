package com.wwang.decorate;

/**
 * 简单查询，相当于直接查询数据库，这里直接返回Result，相当于是数据库
 * @author Administrator
 *
 */
public class SimpleQuery implements Query {

	@Override
	public Result query(String sql) {
		
		return new Result(new Object(), sql);
		
	}

}
