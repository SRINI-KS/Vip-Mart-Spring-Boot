package com.Vip.Mart.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Vip.Mart.Models.UserModel;
import com.Vip.Mart.Services.RegisterService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class RegisterController {
	
	 @Autowired
	    RegisterService userSer;
	   @PostMapping("/registration")
	    public UserModel addValues(@RequestBody UserModel reg) throws Exception{
		   String emailId= reg.getEmailId();
		   if (emailId!=null && !"".equals(emailId)) {
			   UserModel regEmail = userSer.getEmailForValidation(emailId);
			   if (regEmail !=null) {
				throw new Exception("User with "+emailId+" is already availabel");
			}
		   }
	       return this.userSer.addData(reg);
	   }

}
