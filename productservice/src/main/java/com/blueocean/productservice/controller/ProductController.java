package com.blueocean.productservice.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueocean.productservice.model.Coupon;
import com.blueocean.productservice.model.Product;
import com.blueocean.productservice.repo.ProductRepository;
import com.blueocean.productservice.restclient.couponclient;

@RestController
@RequestMapping(path = "/api/v1/productservice")
public class ProductController {

	@Autowired
	ProductRepository productrepo;

	@Autowired
	couponclient couponclient;

	@PostMapping(path = "/product")
	public Product create(@RequestBody Product product) {
		Coupon coupon = couponclient.getCoupon(product.getDescription());
		product.setName(coupon.getCode());
		return productrepo.save(product);
	}

	@GetMapping(path = "/product/{id}")
	public Optional<Product> getCoupon(@PathVariable("id") Long id) {
		return productrepo.findById(id);
	}
}
