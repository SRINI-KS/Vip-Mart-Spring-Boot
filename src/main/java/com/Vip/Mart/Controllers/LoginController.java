package com.Vip.Mart.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Vip.Mart.Models.UserModel;
import com.Vip.Mart.Services.LoginService;

@RestController
@RequestMapping("login")
@CrossOrigin(origins = "http://localhost:4200/")
public class LoginController {
	
	@Autowired
	LoginService uServices;
	@PostMapping("loginValidation")
	public ResponseEntity<UserModel>  loginUser(@RequestBody UserModel regi) throws Exception {
		String tempEmail=regi.getEmailId();
		String tempPassword=regi.getPassword(); 
		
		UserModel valLogin = null;
		if (tempEmail !=null && tempPassword !=null	) {
			 valLogin=uServices.fetchEmailIdAndPassword(tempEmail, tempPassword);
		}
		if(valLogin==null) {
			
			throw new Exception(" Email and Password is wrong ");
			
			
		}
		return new ResponseEntity<>(valLogin,HttpStatus.OK);
	}

}
