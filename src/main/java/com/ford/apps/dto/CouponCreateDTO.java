package com.ford.apps.dto;

import com.ford.apps.entity.Coupon;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CouponCreateDTO {
    private String name;
    private Integer denomination;
    private String code;
    private String expDate;

    public Coupon toEntity() {
        Coupon coupon = new Coupon();
        coupon.setName(this.name);
        coupon.setDenomination(this.denomination);
        coupon.setCode(this.code);
        coupon.setExpDate(this.expDate);
        // isIssued is not set here as it's not part of the creation DTO
        return coupon;
    }
}
