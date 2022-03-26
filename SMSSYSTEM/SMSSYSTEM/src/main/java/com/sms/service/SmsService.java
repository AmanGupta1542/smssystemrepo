package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.model.SmsModel;
import com.sms.repository.SmsRepo;

@Service
public class SmsService {
  
	@Autowired
	private SmsRepo repo;
	
	public List<SmsModel> getPlansList(){
		List<SmsModel> plans = repo.findAll();
		return plans;
	}
}
