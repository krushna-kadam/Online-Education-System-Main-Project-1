package com.KrushnaK.ProjectSessionFrontEnd.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // CREATION A TABLE OF DATABASE
public class Login {
	
	private String Username; //Name,Email,Mo.No.<-- Types Of Username
	@Id
	private String Password; // D0@$578778.<-- Types Of Username
	
	private String  Email ; // kkrushna27@

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String username, String password, String email) {
		super();
		Username = username;
		Password = password;
		Email = email;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Login [Username=" + Username + ", Password=" + Password + ", Email=" + Email + "]";
	}
	
}
