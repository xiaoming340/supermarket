package com.xiaoming.domain;

public class Employee {

	private Integer id;
	private String name;
	private Integer title;
	private Integer age;
	private String sex;
	private String passwd;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTitle() {
		return title;
	}
	public void setTitle(Integer title) {
		this.title = title;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int title, int age, String sex, String passwd) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.age = age;
		this.sex = sex;
		this.passwd = passwd;
	}
}
