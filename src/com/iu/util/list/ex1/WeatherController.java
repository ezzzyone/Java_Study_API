package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	private WeatherService ws;
	private WeatherView wv;
	private Scanner sc;
	
	//결합도가 강하다(높다) : 자체에서 객체 생성
	//결합도가 느슨하다(낮다) : 매개변수를 통해서 만들어진 객체를 주입	
	//                   : 생성자의 매개변수, 
	public WeatherController() {
		this.ws = new WeatherService();
		this.wv = new WeatherView();
		this.sc = new Scanner(System.in);
	}
	
	public void start() {
		ArrayList<CityDTO> ar = new ArrayList<>();
		boolean check=true;
		
		while(check) {
			System.out.println("1. 날씨 초기화");
			System.out.println("2. 날씨정보출력");
			System.out.println("3. 지역날씨출력");
			System.out.println("4. 지역정보추가");
			System.out.println("5. 지역정보삭제");
			System.out.println("6. 종      료");
			int select = sc.nextInt();
			if(select==1) {
				ws.init(ar);
			}else if(select==2) {
				wv.view(ar);
			}else if(select==3) {
				CityDTO cityDTO = ws.find(ar);
				if(cityDTO != null) {
					wv.view(cityDTO);
				}else {
					wv.view("잘못된 도시명");
				}
			}else if(select==4) {
				boolean result = ws.add(ar);
				String message="추가 실패";
				if(result) {
					message="추가 성공";
				}
				wv.view(message);
				
			}else if(select==5) {
				boolean result = ws.remove(ar);
				String message="삭제 실패";
				if(result) {
					message="삭제 성공";
				}
				wv.view(message);				
				
			}else {
				check=!check;
				break;
			}
		}
		
	}

}