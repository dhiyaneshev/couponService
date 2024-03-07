package com.ford.apps.service;

import com.ford.apps.entity.Coupon;

import java.util.List;

public interface ICouponService {

    public Coupon createCoupon(Coupon coupon);

    public Coupon issueCoupon(long couponId, long hrId);

    public List<Coupon> requestCouponsWithDenomination(int denomination);

}
