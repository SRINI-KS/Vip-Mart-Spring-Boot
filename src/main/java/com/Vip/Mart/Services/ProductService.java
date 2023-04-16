package com.Vip.Mart.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vip.Mart.Models.ProductModel;
import com.Vip.Mart.Repositorys.ProductDao;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;
	
	public ProductModel addNewProduct(ProductModel product) {
		return productDao.save(product);
	}

	public List<ProductModel> getProduct() {
		
		return this.productDao.findAll();
	}

}
