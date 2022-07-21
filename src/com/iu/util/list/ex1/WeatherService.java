package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	private StringBuffer sb;
	private Scanner sc;
	
	public WeatherService() {
		sc = new Scanner(System.in);
		sb = new StringBuffer();
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daegu-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5,85,태풍");
	}
	
	public void init(ArrayList<CityDTO> ar) {
		String data = sb.toString();
		System.out.println(data);
		
		data=data.replace("-", ",");
		System.out.println(data);
		StringTokenizer st = new StringTokenizer(data, ",");
		
		while(st.hasMoreTokens()) {
			CityDTO cityDTO = new CityDTO();
			cityDTO.setName(st.nextToken());
			cityDTO.setGion(Double.parseDouble(st.nextToken()));
			cityDTO.setHum(Integer.parseInt(st.nextToken()));
			cityDTO.setStatus(st.nextToken());
			ar.add(cityDTO);
		}
		
		
		
	}
	
	public boolean add(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		System.out.println("도시명 입력");
		cityDTO.setName(sc.next());
		System.out.println("기온 입력");
		cityDTO.setGion(sc.nextDouble());
		System.out.println("습도 입력");
		cityDTO.setHum(sc.nextInt());
		System.out.println("날씨 입력");
		cityDTO.setStatus(sc.next());
		return ar.add(cityDTO);
		
	}//add 메서드 끝
	
	public boolean remove(ArrayList<CityDTO> ar) {
		System.out.println("삭제 하려는 도시명 입력");
		String name = sc.next().toUpperCase();
		boolean r = false;
		//전통 for
		for(int i=0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getName().toUpperCase())) {
				ar.remove(i);
				r= !r;
				break;
			}
		}
		return r;
		//향상된 for
//		for(CityDTO cityDTO: ar) {
//			if(name.equals(cityDTO.getName())) {
//				ar.remove(cityDTO);
//				break;
//			}
//		}
//		
	}
	
	public CityDTO find(ArrayList<CityDTO> ar) {
		CityDTO cityDTO=null;
		System.out.println("도시명 입력");
		String name = sc.next().toLowerCase();
		
		//향상된 for
		for(CityDTO cityDTO2 : ar) {
		
			if(name.equals(cityDTO2.getName().toLowerCase())) {
				cityDTO = cityDTO2;
				break;
			}
		}
		
		
		
		return cityDTO;
	}
	
	

}