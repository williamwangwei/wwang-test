package com.wwang.factory;

public class DatabaseRepositoryFactory implements RepositoryFactoryProvider {

	 @Override
	    public Repository create() {
	        return new DatabaseRepository();
	    }

}
