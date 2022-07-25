package com.iu.network;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Client Start");
		
		Client1 c1 = new Client1();
		Client2 c2 = new Client2();
		
		try {
			//c1.send();
			c2.getFood();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		System.out.println("Client Finish");
	}

}
