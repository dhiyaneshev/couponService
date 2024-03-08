package com.ford.apps.service;

import com.ford.apps.CouponManagementSystemApplication;
import com.ford.apps.entity.Company;

import java.util.List;

public interface ICompanyService {

    public Company addCompany(Company company);

    public boolean deleteCompany(Long company_id);

    public List<Company> getAllCompanies();

    public List<Company> getByCouponId(Long coupon_id);

    public Company issueCouponsToCompany(Long company_id, Integer numberOfCoupons);
}
