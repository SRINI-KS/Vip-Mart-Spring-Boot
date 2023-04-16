package com.Vip.Mart.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vip.Mart.Models.UserModel;



public interface UserRegisterJpa extends JpaRepository<UserModel,Integer> {

	UserModel findByEmailId(String emailId);

	UserModel findByEmailIdAndPassword(String emailId, String password);



}
