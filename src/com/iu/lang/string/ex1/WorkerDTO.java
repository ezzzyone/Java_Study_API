package com.iu.lang.string.ex1;

public class WorkerDTO {
	//멤버변수의 접근지정자
	private String name;      //이름
	private String department;//부서명
	private String job;       //직급
	private String phone;     //전화번호
	
	//생성자는 기본 생성자 필수
	
	//Setter & Getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}