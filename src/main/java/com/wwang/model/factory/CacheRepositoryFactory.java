package com.wwang.model.factory;

public class CacheRepositoryFactory implements RepositoryFactoryProvider {

	@Override
	public Repository create() {
		// TODO Auto-generated method stub
		   return new CacheRepository();
	}

}
