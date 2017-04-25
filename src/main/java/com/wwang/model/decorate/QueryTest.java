package com.wwang.model.decorate;

public class QueryTest {

	public static void main(String[] args) {
		Query simpleQuery = new SimpleQuery();
		System.out.println(simpleQuery.query("select * from t_student") == simpleQuery.query("select * from t_student")); // false
		
		Query cacheQuery = new CacheQuery(simpleQuery);
		System.out.println(cacheQuery.query("select * from t_student") == cacheQuery.query("select * from t_student")); // true
		
		
		Query filterQuery = new FilterQuery(simpleQuery);
		System.out.println(filterQuery.query("select * from t_student where name = 'fuck'"));  // null
		System.out.println(filterQuery.query("select * from t_student where name = 'format'")); // Result(obj=java.lang.Object@1b4fb997, sql=select * from t_student where name = 'format')
		

	}

}
