package com.Vip.Mart.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vip.Mart.Models.UserModel;


@Service
public class LoginService {
	@Autowired
	com.Vip.Mart.Repositorys.UserRegisterJpa jpa;
	
	
//  get email id and password for login validation 
   public UserModel fetchEmailIdAndPassword(String emailId , String password) {
   	return jpa.findByEmailIdAndPassword(emailId, password);
		
	}

}
