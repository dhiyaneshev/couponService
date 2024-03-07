package com.ford.apps.controller;

import com.ford.apps.service.ICouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CouponController {
    @Autowired
    private ICouponService couponService;


}
