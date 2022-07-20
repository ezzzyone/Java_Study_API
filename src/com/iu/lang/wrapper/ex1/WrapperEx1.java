package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		//String jumin = sc.next();
		String jumin = "971224-2234567";
		//this.check1(jumin);
		//this.age(jumin);
		this.season(jumin);
	}
	
	private void check1(String jumin) {
		//1. 남자 여자 판단
		char ch = jumin.charAt(7);//'1'
		if(ch=='1' || ch=='3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		
	}
	
	private void age(String jumin) {
		String year = jumin.substring(0, 2);//년도97
		char ch = jumin.charAt(7);//1900, 2000, 2
		String cen = "20";
		if(ch=='1' || ch =='2') {
			cen="19";
		}
		year = cen+year;
		
		int y = Integer.parseInt(year);
		
		y= 2022-y;
		
		System.out.println("Age : "+y);
		
	}
	
	private void season(String jumin) {
		
		jumin = jumin.substring(2,4);
		
		
		int month=Integer.parseInt(jumin);
		System.out.println(month);
		
		if(month>2 && month<6) {
			System.out.println("봄");
		}else if(month>5 && month<9) {
			System.out.println("여름");
		}else if(month > 8 && month<12) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		
	}
	
	//ex1
	//주민번호 입력 : 6-7 : 971224-1234567
	//2. 현재 나이 출력
	//3. 3-5 월 : 봄
	//   6-8 월 : 여름
	//   9-11 월 : 가을
	//   12-2 월 : 겨울

}
