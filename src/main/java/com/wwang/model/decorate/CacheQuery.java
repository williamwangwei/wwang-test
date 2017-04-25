package com.wwang.model.decorate;

import java.util.HashMap;
import java.util.Map;

/**
 * 缓存查询，如果查询相同的sql，不直接查询数据库，而是返回map中存在的Result
 * @author Administrator
 *
 */
public class CacheQuery implements Query {

	  private Query query;
	  private Map<String, Result> cache = new HashMap<>();
	  public CacheQuery(Query query) {
	      this.query = query;
	  }
	  @Override
	  public Result query(String sql) {
	      if(cache.containsKey(sql)) {
	          return cache.get(sql);
	      }
	      Result result = query.query(sql);
	      cache.put(sql, result);
	      return result;
	  }
}
