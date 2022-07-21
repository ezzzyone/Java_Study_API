package com.iu.util.calender;

import java.util.Calendar;

public class CalenderMain3 {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		ca.set(2022, 11, 31, 23, 59, 50);
		
		System.out.println(ca.getTime()); //시간을 더 편하게 보려고
		
		long now =ca.getTimeInMillis(); //날짜를 long타입으로 바꾸는.
		now = now+100000;
		
		ca.setTimeInMillis(now); //long타입을 날짜로 바꾸는.
	
		System.out.println(ca.getTime());
		
	
		
	}

}
