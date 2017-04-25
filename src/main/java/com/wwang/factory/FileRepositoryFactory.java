package com.wwang.factory;

public class FileRepositoryFactory implements RepositoryFactoryProvider {

	@Override
	public Repository create() {
		// TODO Auto-generated method stub
		return new FileRepository();
	}

}
