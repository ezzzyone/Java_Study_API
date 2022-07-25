package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*서버는 고정된 포트 번호에 바인딩해서 실행 ->ServerSocket을 생성할 때 포트번호 하나를 지정해야함
서버가 실행되면 클라이언트는 서버의 IP 주소와 바인딩 포트 번호로 Socket을 생성하여 연결 요청
ServerSocket은 클라이언트가 연결 요청을 하면 accept() 메서드로 연결 수락, 통신용 socket 생성
그 후 클라이언트와 서버는 각각 Socket을 이용해 데이터를 주고 받음.*/

public class Server1 {
	
	public void receive() throws Exception {
		Scanner sc = new Scanner(System.in);
		ServerSocket serverSocket = new ServerSocket(8282);
		//서버 오픈하고 Client의 접속을 기다림
		System.out.println("Client 접속 기다리는 중");
		//Socket : 상대방과 1:1 통신 
		
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		
		//------------------------------------------
		
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		
		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br=null;
		
		boolean check=true;
		
		while(check) {
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String message = br.readLine();
			
			if(message.toUpperCase().equals("Q")) {
				break;
			}
			
			System.out.println("Clint : "+message);
			
			
			//---------------서버에서 클라이언트로 보냄---------------------
			//처리 순서: message -> BufferedWriter -> OutputStreamWriter -> getOutputStream ->socket
			os = socket.getOutputStream();//0,1 처리
			ow = new OutputStreamWriter(os);//문자 한글자 처리
			bw = new BufferedWriter(ow);
			System.out.println("클라이언트로 보낼 메세지 입력");
			message=sc.next();
			//전송
			bw.write(message+"\r\n");
			bw.flush();
			
			if(message.toUpperCase().equals("Q")) {
				break;
			}
			
		}
		
		
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