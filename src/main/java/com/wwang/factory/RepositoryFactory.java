package com.wwang.factory;

/**
 * 简单工厂
 * @author Administrator
 *
 */
public class RepositoryFactory {
	public Repository create(String type) {
        Repository repository = null;
        switch (type) {
            case "db":
                repository = new DatabaseRepository();
                break;
            case "cache":
                repository = new CacheRepository();
                break;
            case "file":
                repository = new FileRepository();
                break;
        }
        return repository;
    }
 
    public static void main(String[] args) {
        RepositoryFactory factory = new RepositoryFactory();
        factory.create("db").save(new Object());
        factory.create("cache").save(new Object());
        factory.create("file").save(new Object());
    }
}
