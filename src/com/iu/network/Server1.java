package com.iu.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


/*서버는 고정된 포트 번호에 바인딩해서 실행 ->ServerSocket을 생성할 때 포트번호 하나를 지정해야함

서버가 실행되면 클라이언트는 서버의 IP 주소와 바인딩 포트 번호로 Socket을 생성하여 연결 요청

ServerSocket은 클라이언트가 연결 요청을 하면 accept() 메서드로 연결 수락, 통신용 socket 생성

그 후 클라이언트와 서버는 각각 Socket을 이용해 데이터를 주고 받음.*/

public class Server1 {
	
	public void receive() throws Exception{
		
		ServerSocket serverSocket = new ServerSocket(8282); //서버 오픈. 클라이언트 접속 기다림/수락. 
		System.out.println("클라이언트 접속 기다리는 중");
		
		Socket socket = serverSocket.accept(); //소켓: 연결된 클라이언트와 1:1 통신
		System.out.println("클라이언트와 접속 완료");
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		String message = br.readLine();//한줄읽어오기
		
		System.out.println("클라이언트가 말한다:"+message);
		
		br.close();
		ir.close();
		is.close();
		socket.close(); //완전히 종료될때는 둘다 닫아줌.
		serverSocket.close();
		
		
		
		
	}

}
