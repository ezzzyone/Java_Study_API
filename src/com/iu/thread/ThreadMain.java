package com.iu.thread;

public class ThreadMain {

	public static void main(String[] args) {

		ThreadTest1 t1 = new ThreadTest1();
		ThreadTest2 t2 = new ThreadTest2();
		Thread t = new Thread(t2); //t를 실행하면 t2에 있는 run이 실행됨.
		
		//thread 사용시, 개발자가 직접 호출하지 않고, os에 실행부탁함(start로 실행)
//		t1.start();
//		t2.start();
		//thread 사용하여 번갈아가며 실행됨.
		
		t.start();
		
		
		
		

	}

}
