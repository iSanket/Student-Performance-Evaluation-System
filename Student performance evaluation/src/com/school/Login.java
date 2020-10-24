package com.school;

public class Login {
	private String username;
	private String password;
	private String role;
	
	public Login() {
		this("", "","");
	}
	public Login(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return String.format("Login [username=%s, password=%s, role=%s]", username,
				password, role);
	}
}
