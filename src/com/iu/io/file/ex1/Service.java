package com.iu.io.file.ex1;

import java.util.ArrayList;

public interface Service {
	
	public ArrayList<StudentDTO> getList()throws Exception;
	//StudentDAO의 getList를 호출하고 총점과 평균을 각각 
	//계산해서 대입하고 그 List를 리턴
	
	public int setList(ArrayList<StudentDTO> ar)throws Exception;
	//StudentDAO의 setList를 호출하고
	//그결과를 리턴
	
	public StudentDTO getStudent(ArrayList<StudentDTO> ar)throws Exception;
	//찾을려고 하는 학생의 번호를 입력 받아서
	//찾은 학생을 리턴
	
	public int setStudnetDelete(ArrayList<StudentDTO> ar)throws Exception;
	//삭제하려는 학생의 번호를 입력 받아서
	//일치하는 학생을 삭제
	//삭제가 성공하면 1을 리턴, 실패 0을리턴
	
	public void setStudentAdd(ArrayList<StudentDTO> ar)throws Exception;
	//학생 한명을 추가
	//
	
}