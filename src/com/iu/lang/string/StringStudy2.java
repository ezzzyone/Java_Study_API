package com.iu.lang.string;

public class StringStudy2 {
	
	public void ex2() {
		//키보드로부터 파일명을 입력 받음, abc.txt, jpg.word
		//파일이 이미지파일인지 아닌지 구별
		//확장자 jpg, png, gif, jpeg, 
		String [] files= {"jpg", "png", "gif", "jpeg"};
		
		String fileName="abc.test.gif.word";
		int index = fileName.lastIndexOf(".");
		
		fileName=fileName.substring(index+1);//.gif
		
		String result="이미지 파일이 아닙니다";
		for(int i=0;i<files.length;i++) {
			if(fileName.equals(files[i])) {
				result="이미지 파일입니다";
				break;
			}
		}
		System.out.println(result);
		
		
	}
	
	public void studyIndexOfEx1() {
		String names="iu,suji,choa,hani";
		boolean check=true;
		int count=0;//쉼표의 갯수를 담을 변수
		int index=0;//, 의 찾은 인덱스 번호
		//1. names에는 몇개의 쉼표가 있는가??
		//2, 총 몇명입니까?
		while(check) {
			
			index = names.indexOf(",", index);
			
			if(index==-1) {
				break;
			}else {
				count++;
				index++;
			}
			
		}//while 끝
		
		System.out.println(", 의 갯수 : "+count);
		System.out.println("인원수    : "+(count+1));
	}
	
	public void studyIndexOf() {
		String str="Hello Java";
		
		int index=str.indexOf("ll");//ch => char
		System.out.println(index);
		
		String replace = str.replace('l', 'w');
		System.out.println(replace);
		System.out.println(str);
		
		str="Google에 입사지원동기는...Google에 입사하면 노예가 ...";
		System.out.println(str);
		
		str = str.replace("Google", "Samsung");
		
		System.out.println(str);
		
		str="hi";
		String str2 =" h i ";
		str2 = str2.trim();
		str2 = str2.replace(" ", "");
		System.out.println(str.equals(str2));
				
		
		
		
	}
	
	public void studySubString() {
		//하나의 문자열을 분리 하는 작업(parsing)
		String member="iu/1234";
		String pw = member.substring(3);
		String id = member.substring(0, 2);
		System.out.println(pw);
		System.out.println(id);
		
		
	}

}
