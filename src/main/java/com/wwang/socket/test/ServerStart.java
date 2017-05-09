package com.wwang.socket.test;

import java.io.IOException;

public class ServerStart {

	public static void main(String[] args) {
		
		try {
			new MultiThreadServer().service();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
