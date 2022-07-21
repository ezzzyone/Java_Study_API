package com.iu.util.calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderMain {

	public static void main(String[] args) {

		//Calendar ca = new GregorianCalendar();
		//현재 년 월 일 시 분 초 밀리세컨즈
		Calendar ca = Calendar.getInstance(); //현재 시간 가지고 옴
		System.out.println(ca);
		
		int y = ca.get(Calendar.YEAR); //static => 클래스명.변수명

		System.out.println(y);
	}

}
