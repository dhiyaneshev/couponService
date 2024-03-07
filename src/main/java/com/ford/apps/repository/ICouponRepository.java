package com.ford.apps.repository;

import com.ford.apps.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICouponRepository extends JpaRepository<Coupon, Long> {
}
