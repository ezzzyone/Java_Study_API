package com.iu.lang;

public class Car {
	
	@Override
	public boolean equals(Object obj) {
		Car car = (Car)obj;
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "car에서 오버라이딩 함";
	}

}
