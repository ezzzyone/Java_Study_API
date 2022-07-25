package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	
	//getFood Server와 접속 후 번호에따른 메시지 보여줌, 번호를 입력받아 서버로 전송.
	//1: 점심메뉴
	//2: 저녁메뉴
	//3: 종료
	//서버가 보내는 메뉴 받아서 출력
	
	public void getFood() throws Exception{
		
		Socket socket = new Socket("192.168.7.31", 8282);
		Scanner sc= new Scanner(System.in);
		
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		
		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br=null;
		
		boolean check=true;
		while(check) {
			System.out.println("1. 점심메뉴");
			System.out.println("2. 저녁메뉴");
			System.out.println("3. 종료");
			
			int select = sc.nextInt();
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			bw.write(select+"\r\n");
			bw.flush();
			
			if(select==3) {
				break;
			}
			
			//-------------------------
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String message = br.readLine();
			System.out.println(message);
		} //while 끝
		
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		
		socket.close();
	}
}
