package com.blueocean.couponservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueocean.couponservice.model.Coupon;
import com.blueocean.couponservice.repo.CouponRepository;

@RestController
@RequestMapping(path = "/api/v1/couponservice")
public class CouponController {

	@Autowired
	CouponRepository couponrepo;

	@PostMapping(path = "/coupon")
	public Coupon create(@RequestBody Coupon coupon) {
		return couponrepo.save(coupon);
	}

	@GetMapping(path = "/coupon/{code}")
	public Coupon getCoupon(@PathVariable("code") String code) {
		return couponrepo.findByCode(code);
	}
}
