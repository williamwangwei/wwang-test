package com.wwang.model.factory;

public class FileRepositoryFactory implements RepositoryFactoryProvider {

	@Override
	public Repository create() {
		// TODO Auto-generated method stub
		return new FileRepository();
	}

}
