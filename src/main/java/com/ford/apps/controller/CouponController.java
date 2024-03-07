package com.ford.apps.controller;

import com.ford.apps.dto.CouponCreateDTO;
import com.ford.apps.dto.CouponResponseDTO;
import com.ford.apps.entity.Coupon;
import com.ford.apps.repository.ICouponRepository;
import com.ford.apps.service.ICouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/coupons")
public class CouponController {
    @Autowired
    private ICouponService couponService;

    @GetMapping("/")
    public List<Coupon> getAllCoupons() {
        return couponService.getAllCoupons();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coupon> getCouponById(@PathVariable Long id) {
        Coupon coupon = couponService.getCouponById(id);
        return ResponseEntity.ok(coupon);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Coupon> updateCoupon(@RequestBody Coupon couponDetails) {
        Coupon updatedCoupon = couponService.updateCoupon(couponDetails);
        return ResponseEntity.ok(updatedCoupon);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteCoupon(@PathVariable Long id) {
        couponService.deleteCoupon(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}