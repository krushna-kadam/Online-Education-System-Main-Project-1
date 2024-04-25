package com.KrushnaK.ProjectSessionFrontEnd.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {

	private String Name;

	private String Address;

	private long MobileNo;
	@Id
	private String Email;
	
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Contact(String name, String address, long mobileNo, String email) {
		super();
		Name = name;
		Address = address;
		MobileNo = mobileNo;
		Email = email;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public long getMobileNo() {
		return MobileNo;
	}


	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	@Override
	public String toString() {
		return "Contact [Name=" + Name + ", Address=" + Address + ", MobileNo=" + MobileNo + ", Email=" + Email + "]";
	}
	
	
	
}

//	pojo  gcs+gcuf+get_set+tostr
