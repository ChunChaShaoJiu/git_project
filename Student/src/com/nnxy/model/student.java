package com.nnxy.model;

public class student {
	private int id;//唯一Id
	private String name;//姓名
	private String password;//密码
	private int age;//年龄
	private boolean sex;//性别

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int id, String name, String password, int age, boolean sex) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.sex = sex;
	}
	
}
