package com.iu.thread;

public class ThreadTest2 extends Thread{
	
	@Override
	public void run() {
		this.getAlpa();
	}
	
	private void getAlpa() {
		for(int i ='a'; i<'z';i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
