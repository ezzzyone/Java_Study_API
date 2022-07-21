package com.iu.util.calender;

import java.util.Calendar;

public class CalenderMain2 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		Calendar future = Calendar.getInstance();
		
		Calendar bd = Calendar.getInstance();
		bd.set(Calendar.YEAR, 1998);
		bd.set(Calendar.MONTH, 1);
		bd.set(Calendar.DATE, 31);
		
		long n = now.getTimeInMillis();
		long b = bd.getTimeInMillis();
		
		long result = n-b;
		System.out.println(result/(1000*60*60*24)+ "일");
		System.out.println(result/(1000*60*60*24)/365+ "년");
	
		
//		future.set(Calendar.MINUTE, 17);
//		
//		
//		long n = now.getTimeInMillis();
//		long f = future.getTimeInMillis(); //밀리세컨즈 단위 : 1s = 1000ms
//		
//		long result = f-n;
//				System.out.println(result/(1000*60));
		
	}

}
