package com.wwang.Thread02;

import java.util.concurrent.Callable;

public class RealData implements Callable {
	protected String data;

	public RealData(String data) {
		this.data = data;
	}

	@Override
	public String call() throws Exception {
		//利用sleep方法来表示真是业务是非常缓慢的
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return data;
	}
}
