package com.wwang.model.observable;

import java.util.Observable;
import java.util.Observer;

public class AdminA implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		  System.out.println("adminA: " + arg1);

	}

}
