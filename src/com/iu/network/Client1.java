package com.iu.network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {
	
	public void send () throws Exception{//상대 서버로 보내는 용도
		
		Scanner sc = new Scanner(System.in);
		
		Socket socket = new Socket("192.168.7.31", 8282);
		System.out.println("서버 접속 완료");
		System.out.println("서버에 보낼 메세지 입력");
		
		String message= sc.next();
		//순서: message -> 버퍼라이터 -> 아웃풋스트림라이터 -> 아웃풋스트림 ->소켓
		OutputStream os = socket.getOutputStream(); //0,1 담아 처리
		OutputStreamWriter ow = new OutputStreamWriter(os); //문자 한글자 처리
		BufferedWriter bw = new BufferedWriter(ow);
		
		//전송
		bw.write(message+"\r\n");
		bw.flush(); //꽉차면 안보내지니 밀고 강제로 보냄
		
		//자원해제.해제는 연결 역순으로
		bw.close();
		ow.close();
		os.close();
		socket.close();
		
		
	}

}
