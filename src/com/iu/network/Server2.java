package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Server2 {
	
	private ArrayList<String> lunch;
	private ArrayList<String> dinner;
	
	public Server2 () {
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();
		
		lunch.add("마라탕");
		lunch.add("서브웨이");
		lunch.add("초밥");
		lunch.add("쌀국수");
	
		dinner.add("교촌");
		dinner.add("해장국");
		dinner.add("볶음밥");
		dinner.add("다이어트");
	}
	
	//getFood Server에서 메시지를 기다림
	//1: 점심메뉴중 랜덤한 하나를 client에 전송
	//2: 저녁메뉴중 랜덤한 하나를 client에 전송
	//3: 프로그램이 종료
	//4: 그외 나머지: 잘못입력된 번호입니다^^
	
	public void getFood() throws Exception{
		ServerSocket serverSocket = new ServerSocket(8282); //서버소켓열어서 접속받아줘야함
		
		Socket socket = serverSocket.accept(); //소켓을 만들어서 클라이언트 접속하면 accept 해줌
		
		OutputStream os=null; //보내는거
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		
		InputStream is=null; //받는거
		InputStreamReader ir=null;
		BufferedReader br=null;
		
		boolean check=true;
		while(check) {
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String message = br.readLine(); //일단은 스트링으로 받아야 함
			
			int select = Integer.parseInt(message);
			
			Random rd = new Random(Calendar.getInstance().getTimeInMillis());
			//랜덤이 만들어질때의 시간을 가져옴
			
			if(select==1) {
				int index = rd.nextInt(lunch.size());
				message = lunch.get(index);
			}else if (select==2) {
				int index = rd.nextInt(dinner.size());
				message = dinner.get(index);
			}else if (select==3) {
				
				break;
				
			}else {
				
				message="롱 넘버입니다.";
				
			}
			
			os = socket.getOutputStream(); //보내는거
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			bw.write(message+"\r\n");
			bw.flush();
			
		}//while 끝
		
		br.close();
		ir.close();
		is.close();
		
		bw.close();
		ow.close();
		os.close();
		
		socket.close();
		serverSocket.close();
	}
}
