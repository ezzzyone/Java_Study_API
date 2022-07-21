package com.iu.lang.string.ex1;

public class SplitMain {

	public static void main(String[] args) { //메인 클래스가 먼저 실행
		WorkerService ws = new WorkerService();
		WorkerView wv = new WorkerView();
		
		WorkerDTO [] workerDTOs = ws.init(); //workerDTOs 배열은 WorkerService의 init 메소드의 리턴 값을 받는다.
		wv.view(workerDTOs); //WorkerView의 workerDTOs 값을 view 메소드를 통해 보여줌.
		int num=10;
		
		String str = String.valueOf(num);
		System.out.println(str);
		

	}

}