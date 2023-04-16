package com.Vip.Mart.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vip.Mart.Models.ProductModel;
import com.Vip.Mart.Services.ProductService;

@RestController
@RequestMapping("product")
@CrossOrigin(origins = "http://localhost:4200/")
public class ProductController {
	@Autowired
	ProductService productService;
	@PostMapping("/add")
	public ProductModel addNewProduct(@RequestBody ProductModel product) {
		return productService.addNewProduct(product);
	}
	
	@GetMapping("/getProduct")
	public List<ProductModel> getProduct() {
		return productService.getProduct();
	}

}
