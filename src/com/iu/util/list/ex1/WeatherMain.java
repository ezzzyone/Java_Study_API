package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherController wc = new WeatherController();
		wc.start();
		
		//1. 클래스의 역할과 메서드의 역할, 변수의 역할
		//WeatherMain		: 프로그램실행,Test    
		//WeatherService	: Data 가공
		//WeatherContrllor	: 관리
		//WeatherView		: 출력전용
		//CityDTO			: Data
		
//		WeatherView wv = new WeatherView();
//		WeatherService ws = new WeatherService();
//		CityDTO cityDTO = new CityDTO();
//		cityDTO.setName("NY");
//		cityDTO.setGion(31.2);
//		cityDTO.setHum(20);
//		cityDTO.setStatus("비");
//		
//		CityDTO cityDTO2 = new CityDTO();
//		cityDTO2.setName("LA");
//		cityDTO2.setGion(17);
//		cityDTO2.setHum(90);
//		cityDTO2.setStatus("눈");
//		
//		ArrayList<CityDTO> ar = new ArrayList<>();
//		ar.add(cityDTO);
//		ar.add(cityDTO2);
		
//		ArrayList<CityDTO> ar = new ArrayList<>();
//		ws.init(ar);
		
//		ws.add(ar);
		
//		wv.view(ar);
		
		
		

	}

}