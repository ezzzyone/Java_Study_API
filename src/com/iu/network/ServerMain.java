package com.iu.network;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Server Start");
		
		Server1 s1 = new Server1();
		Server2 s2 = new Server2();
		try {
			//s1.receive(); //서버 소켓만들고 준비함.
			s2.getFood();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		
		System.out.println("Server Finish");

	}

}
