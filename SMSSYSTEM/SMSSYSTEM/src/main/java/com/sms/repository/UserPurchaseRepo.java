package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.UserPurchaseModel;

public interface UserPurchaseRepo extends JpaRepository<UserPurchaseModel, Long>{

}
