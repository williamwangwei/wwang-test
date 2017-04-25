package com.wwang.model.factory;

public class RepositoryFactoryTest {
	
	public static void main(String[] args) {
		RepositoryFactoryProvider dbProvider = new DatabaseRepositoryFactory();
		dbProvider.create().save(new Object());
		RepositoryFactoryProvider cacheProvider = new CacheRepositoryFactory();
		cacheProvider.create().save(new Object());
		RepositoryFactoryProvider fileProvider = new FileRepositoryFactory();
		fileProvider.create().save(new Object());
	}
	
}
