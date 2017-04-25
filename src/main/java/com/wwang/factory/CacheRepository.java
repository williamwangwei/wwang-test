package com.wwang.factory;

public class CacheRepository implements Repository {

	@Override
	public void save(Object obj) {
		System.out.println("save in cache");

	}

}
