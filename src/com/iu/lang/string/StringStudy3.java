package com.iu.lang.string;

public class StringStudy3 {
	
	public void studySplit3() {
		String info = "서울,대전-대구,부산-제주,광주-강릉";
		//전처리
		info = info.replace(",", "-");
		System.out.println(info);
		String [] cities = info.split("-");
		for(String c : cities) {
			System.out.println(c);
		}
	}
	
	public void studySplit2() {
		String info="1997 12 24";
		String [] infos = info.split(" ");
		for(String str : infos) {
			System.out.println(str);
		}
		
	}
	
	public void studySplit() {
		String str="iu,suji,choa,hani";
		
		String [] names = str.split(",");
		
		//for -> for(초기식;조건식;증감식){}
		//향상된 for문 
		//for(배열에모은데이터타입 변수명: 배열참조변수명){}
//		for(int i=0;i<names.length;i++) {
//			String name = names[i];
//		}

		for(String name:names) {
			System.out.println(name);
		}
		
		
		
		
	}

}
