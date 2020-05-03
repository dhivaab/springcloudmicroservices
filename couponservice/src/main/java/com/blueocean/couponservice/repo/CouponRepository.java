package com.blueocean.couponservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blueocean.couponservice.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
