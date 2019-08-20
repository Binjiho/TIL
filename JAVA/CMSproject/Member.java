package com.hansung;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String nickName;
	private String sex;
	private String email;
	private String homePage;
	private String address;
	private String[] hobby;
	
	public Member() {
		super();
	}
	public Member(String id, String pw, String name, String nickName, String sex, String email, String homePage, String address, String[] hobby) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.nickName=nickName;
		this.sex=sex;
		this.email=email;
		this.homePage=homePage;
		this.address=address;
		this.hobby=hobby;
	}
	public String getId() {return id;}
	public String getPw() {return pw;}
	public String getName() {return name;}
	public String getnickName() {return nickName;}
	public String getSex() {return sex;}
	public String getEmail() {return email;}
	public String getHomePage() {return homePage;}
	public String getAddress() {return address;}
	public String[] getHobby() {return hobby;}
	
	
	public void setId(String id) {this.id=id;}
	public void setPw(String pw) {this.pw=pw;}
	public void setName(String name) {this.name=name;}
	public void setnickName(String nickName) {this.nickName=nickName;}
	public void setSex(String sex) {this.sex=sex;}
	public void setEmail(String email) {this.email=email;}
	public void setHomePage(String homePage) {this.homePage=homePage;}
	public void setAddress(String name) {this.name=name;}
	public void setHobby(String[] hobby) {this.hobby=hobby;}
	
	
}
