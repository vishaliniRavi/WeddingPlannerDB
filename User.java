package com.weddingplanner;

import java.util.Objects;

public class User {
	private String user_name;
	private String email_id;
	private String password;
	public User(String user_name, String email_id, String password) {
		super();
		this.user_name = user_name;
		this.email_id = email_id;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", email_id=" + email_id + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email_id, password, user_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email_id, other.email_id) && Objects.equals(password, other.password)
				&& Objects.equals(user_name, other.user_name);
	}
	
}	
