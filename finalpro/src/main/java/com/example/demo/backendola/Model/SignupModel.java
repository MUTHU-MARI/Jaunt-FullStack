package com.example.demo.backendola.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Userdetail")
public class SignupModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public SignupModel(int id, String username, String email, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public SignupModel() {
		super();
	}
	
	
	

}




//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//@Entity
//public class SignupModel
//{
//	@Id
//	private int id;
//	private String username;
//	private String email;
//	private String password;
//	private String ConfirmPassword;
//	private int MobileNumber;
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword( String password) {
//		this.password = password;
//	}
//	public String getConfirmPassword() {
//		return ConfirmPassword;
//	}
//
//	public void setConfirmPassword(String Confirmpassword) {
//		this.ConfirmPassword = Confirmpassword;
//	}
//	public int getMobileNumber() {
//		return MobileNumber;
//	}
//
//	public void setMobileNumber(int MobileNumber) {
//		this.MobileNumber = MobileNumber;
//	}
//	public SignupModel() {
//		super();
//	}
//	
// public SignupModel(int id,String username,String email,String password, String ConfirmPassword, int MobileNumber) {
//		super();
//		this.id=id;
//	    this.username=username;
//	    this.email=email;
//	    this.password=password;
//	    this.ConfirmPassword=ConfirmPassword;
//	    this.MobileNumber=MobileNumber;
//	}
//
//}
