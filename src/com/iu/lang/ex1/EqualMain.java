package com.iu.lang.ex1;

public class EqualMain {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setPrice(100);
		p1.setSize(40);
		
		Phone p2 = new Phone();
		p2.setPrice(100);
		p2.setSize(40);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		System.out.println(p2.equals(p1));
		
		

	}

}
