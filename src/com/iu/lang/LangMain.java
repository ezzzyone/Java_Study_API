package com.iu.lang;



public class LangMain {

	public static void main(String[] args) {
		
		Object obj = new Object();
		String str = obj.toString();
		Member member = new Member();
		System.out.println(str);
		str =member.toString();
		System.out.println(str);
		MemberClient mc = new MemberClient();
		Car car = new Car();
		Car car2 = new Car();
		obj = member;
		
		boolean check = car.equals(obj);// car == car2
		System.out.println(car);
		System.out.println(car.toString());
		System.out.println(check);
		
		String name="iu";
		System.out.println(name);
		
		

	}

}
