package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherView {
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(CityDTO cityDTO) {
		System.out.println(cityDTO.getName());
		System.out.println(cityDTO.getGion());
		System.out.println(cityDTO.getHum());
		System.out.println(cityDTO.getStatus());
	}
	
	public void view(ArrayList<CityDTO> ar) {
		for(int i=0;i<ar.size();i++) {
			CityDTO cityDTO = ar.get(i);
			this.view(cityDTO);
			
		}
		
	}
}