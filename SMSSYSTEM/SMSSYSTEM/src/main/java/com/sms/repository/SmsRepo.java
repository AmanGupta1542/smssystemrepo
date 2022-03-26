package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.SmsModel;

public interface SmsRepo extends JpaRepository<SmsModel, Long>{

}
