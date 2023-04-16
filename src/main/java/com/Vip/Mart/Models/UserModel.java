	package com.Vip.Mart.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserDetails")
public class UserModel {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "Id")
	    private int id;
	    @Column(name = "userName")
	    private  String userName;
	    @Column(name = "emailId")
	    private  String emailId;
	    @Column(name = "password")
	    private  String password;
	    @Column(name = "mobileNumber")
	    private  String mobileNumber;
	    @Column(name = "role")
	    private  String role="user";
	    
		
		public UserModel(int id, String userName, String emailId, String password, String mobileNumber, String role) {
			super();
			this.id = id;
			this.userName = userName;
			this.emailId = emailId;
			this.password = password;
			this.mobileNumber = mobileNumber;
			this.role = role;
		}
		public UserModel() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
	    
	    
		
	

}
