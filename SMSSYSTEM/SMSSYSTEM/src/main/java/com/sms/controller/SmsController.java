package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.ehandling.InternalServerErr;
import com.sms.model.SmsModel;
import com.sms.model.UserModel;
import com.sms.service.SmsService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/sms")
public class SmsController {
  
	   @Autowired
	   private SmsService service;
	   //Get sms plan
		@GetMapping("/plans")
		public ResponseEntity<List<SmsModel>> getUser() {
			List<SmsModel> plans = service.getPlansList();	
			if(plans.size()<=0) {
				throw new InternalServerErr("No plan found.");
			}
			return new ResponseEntity<List<SmsModel>>(plans, HttpStatus.OK);
		}
}
