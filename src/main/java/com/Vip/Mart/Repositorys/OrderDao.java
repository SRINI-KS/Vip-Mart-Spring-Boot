package com.Vip.Mart.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vip.Mart.Models.OrderDetailModel;

public interface OrderDao extends JpaRepository<OrderDetailModel, Long >{

}
