package com.wwang.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestFuture {

	static class Job<Object> implements Callable<Object>{

		@Override
		public Object call() throws Exception {
			
			System.out.println("Job：123213");
			Thread.sleep(2000);
			return (Object) "Job";
		}
		
	}
	
	static class Job01<Object> implements Callable<Object>{

		@Override
		public Object call() throws Exception {
			
			System.out.println("Job01: 123213");
			Thread.sleep(4000);
			return (Object) "Job01";
		}
		
	}
	
	static class Job02<Object> implements Callable<Object>{

		@Override
		public Object call() throws Exception {
			
			System.out.println("Job02: 123213");
			Thread.sleep(6000);
			return (Object) "Job02";
		}
		
	}
	
	
	public static void main(String[] args) {
		
		FutureTask futureTask = new FutureTask(new Job<Object>());
		new Thread(futureTask).start();
		
		
		
		//做一些事情
		
		try {
			Object result =(Object) futureTask.get();
			System.out.println(result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
