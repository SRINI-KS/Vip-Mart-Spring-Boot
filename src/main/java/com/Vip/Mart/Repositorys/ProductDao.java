package com.Vip.Mart.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vip.Mart.Models.ProductModel;
public interface ProductDao extends JpaRepository<ProductModel, Integer>{

}
