package com.wwang.model.adapt;

public class TestAdapter {

	public static void main(String[] args) {
		Targetable targetable = new Adapter();
		targetable.method(); // source method
		targetable.newMethod(); // new method
	}

}
