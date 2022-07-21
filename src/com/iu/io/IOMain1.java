package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {

	public static void main(String[] args) {
		
		//키보드랑 연결하기
		//키보드로부터 글자를 입력받는 순서 작성
		
		InputStream is = System.in;//System.in : 키보드 연결 //byte단위로 처리.
		InputStreamReader ir = new InputStreamReader(is); //한글자단위로 변경. 리더로 모음.
		BufferedReader br = new BufferedReader(ir); //보조스트림. 버퍼에 최종 저장됨.
		
		try {
			System.out.println("키보드에서 입력 후 엔터");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
	
			e.printStackTrace();
		}

	}

}
