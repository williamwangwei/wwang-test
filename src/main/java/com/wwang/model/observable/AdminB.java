package com.wwang.model.observable;

import java.util.Observable;
import java.util.Observer;

public class AdminB implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		  System.out.println("AdminB: " + arg1);

	}

}
