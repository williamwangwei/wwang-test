package com.wwang.model.factory;

public class DatabaseRepository implements Repository {

	@Override
    public void save(Object obj) {
        System.out.println("save in database");
    }

}
