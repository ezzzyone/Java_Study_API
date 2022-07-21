package com.iu.util.list;

import java.util.ArrayList;

public class ListView {
	
	public void view(ArrayList ar) {
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("=====================");
		
	}

}