package com.wwang.model.adapt;

public class Adapter extends Source implements Targetable {

	@Override
	public void newMethod() {
		 System.out.println("new method");
	}

}
