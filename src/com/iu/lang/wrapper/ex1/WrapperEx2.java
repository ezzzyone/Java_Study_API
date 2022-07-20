package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	
	//juminCheck
	//주민번호 입력
	//	9	7	1	1	2	4	-	1	2	3	4	5	6	7(체크용번호)
	//*	2	3	4	5	6	7		8	9	2	3	4	5 
	//+ 18	21	4	5	12	28		8	18	6	12	20	30
	//  총합 : 192
	
	// 총합 을 11로 나누어서 나머지를 구함
	// 192  / 11 --몫 17 나머지 5
	
	// 나머지를 11에서 뺀 결과를 체크용 번호와 같은지 비교
	// 11 - 0 = 11
	
	//만약에 위의 연산결과가 두자리라면
	// 연산결과를 다시 10으로 나눈 나머지와 체크용번호를 비교
	// 11 / 10   --- 나머지 1
	public void juminCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		String jumin="971224-1234567";
		int count=2;
		int sum=0;
		for(int i=0;i<jumin.length()-1;i++) {
			//1. substring()  : String
			//String num = jumin.substring(i, i+1);//1,2  2,3
			//int n = Integer.parseInt(num);
			//2. charAt()     : char
	//		char ch = jumin.charAt(0); //1,2,3..
			//int n = Integer.parseInt(ch+"");
	//		String num = String.valueOf(ch);
	//		int n = Integer.parseInt(num);
			
			if(i==6) {
				continue;
			}
			
			int n = Integer.parseInt(String.valueOf(jumin.charAt(i)));
			sum = sum + n*count;
			count++;
		}
		
		int check = sum%11;
		
		check = 11-check;
		
		if(check>9) {
			check = check%10;
		}
		
		//check용번호
		int checkNum =Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		
		if(check == checkNum) {
			System.out.println("정상 주민번호");
		}else {
			System.out.println("비정상 주민번호");
		}
		
		
	}
	
	
	
}
