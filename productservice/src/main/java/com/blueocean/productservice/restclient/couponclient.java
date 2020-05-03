package com.blueocean.productservice.restclient;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.blueocean.productservice.model.Coupon;

@FeignClient("COUPONSERVICE")
@RibbonClient("COUPONSERVICE")
public interface couponclient {
	
	@GetMapping("/api/v1/couponservice/coupon/{code}")
	Coupon getCoupon(@PathVariable("code") String code);

}
