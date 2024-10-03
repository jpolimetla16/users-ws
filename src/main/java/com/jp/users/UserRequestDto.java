package com.jp.users;

import java.io.Serializable;

public class UserRequestDto implements Serializable {

	private static final long serialVersionUID = 2470955708875123953L;

	private String email;
	private String password;

	public UserRequestDto() {

	}

	public UserRequestDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
