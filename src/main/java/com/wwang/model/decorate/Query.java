package com.wwang.model.decorate;

/**
 * 查询接口，有简单查询和缓存查询
 * @author Administrator
 *
 */
public interface Query {
	Result query(String sql);
}
