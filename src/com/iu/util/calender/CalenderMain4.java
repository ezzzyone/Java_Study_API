package com.iu.util.calender;

import java.util.Calendar;

public class CalenderMain4 {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance(); //getInstance : 실행된 현재 시간을 저장
		System.out.println(ca.getTime()); // getTime 보기 편하도록 
		
		//ca.roll(Calendar.MINUTE, 20); //분의 단위만 바꿔줌. 시간 변화 X
		ca.add(Calendar.MINUTE, 20); // 시간까지 넘어감.
		System.out.println(ca.getTime());
		

	}

}
