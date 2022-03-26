package com.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.model.SmsModel;
import com.sms.model.UserModel;
import com.sms.model.UserPurchaseModel;
import com.sms.repository.SmsRepo;
import com.sms.repository.UserRepo;

@Service
public class UserService {
  
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private SmsRepo smsRepo;
	
	public void createUser(UserModel user) throws RuntimeException{
		userRepo.save(user);
	}
	
	public UserModel getUser(Long userid) {
		return userRepo.findById(userid).orElse(null);
	}
	
	public List<UserModel> getAllUser(){
		List<UserModel> users = userRepo.findAll();
		return users;
	}
	
	public void purhcasePlan(UserPurchaseModel purchase) throws RuntimeException{
		Long userid = purchase.getUserid();
		Long planid = purchase.getSmsplan();
		Optional<UserModel> user = userRepo.findById(userid);
		Optional<SmsModel> plan = smsRepo.findById(userid);
		System.out.println(user);
		System.out.println(plan);	
		//implement logics.......
	}
}
