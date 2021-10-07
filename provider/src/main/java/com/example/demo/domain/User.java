package com.example.demo.domain;
import java.io.Serializable;

public class User implements Serializable{
    private Integer id;
    private String name;
    private String pass;
    private String mobile;
    private Integer age;
    private char status;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getPass() {
		return pass;
	}
    
}
