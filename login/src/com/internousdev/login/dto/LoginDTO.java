package com.internousdev.login.dto;

public class LoginDTO {

	//データカラム値に対応したフィールド変数を宣言。
	private int id;
	private String name;
	private String password;

	//フィールド変数に対応したGetterSetterを定義する。
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

}
