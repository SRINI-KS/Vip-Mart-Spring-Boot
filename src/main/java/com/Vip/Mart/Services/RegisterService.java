package com.Vip.Mart.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Vip.Mart.Models.UserModel;
import com.Vip.Mart.Repositorys.UserRegisterJpa;

@Service
public class RegisterService {
	
	
	@Autowired
	UserRegisterJpa jpa;
    public UserModel addData(UserModel reg){
        return this.jpa.save(reg);
    }
    
    public UserModel getEmailForValidation(String emailId) {
		return jpa.findByEmailId(emailId);
	}

}
