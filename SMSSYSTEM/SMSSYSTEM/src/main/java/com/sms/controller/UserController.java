package com.sms.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sms.ehandling.InternalServerErr;
import com.sms.ehandling.Response;
import com.sms.ehandling.UserNotFound;
import com.sms.model.SmsModel;
import com.sms.model.UserModel;
import com.sms.model.UserPurchaseModel;
import com.sms.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/user")
public class UserController {
    
	@Autowired
	private UserService userService;
	
	//Create user
	@PostMapping("/create")  
    public ResponseEntity<Object> createUser(@RequestBody UserModel user){	
		Response response = new Response();
		try {
		   userService.createUser(user);
		   response.setDateTime(LocalDateTime.now());
		   response.setMessage("User created successfully.");
		   response.setStatus(HttpStatus.CREATED);
		   return new ResponseEntity<Object>(response, HttpStatus.CREATED);
		}catch(Exception e) {
		   throw new InternalServerErr("Internal Server Error.");
		}
    }
	
	//Get all user
	@GetMapping("/")
	public ResponseEntity<List<UserModel>> getUser() {
		List<UserModel> book = userService.getAllUser();	
		if(book.size()<=0) {
			throw new UserNotFound("No user found");
		}
		return new ResponseEntity<List<UserModel>>(book, HttpStatus.OK);
	}
	
	//Get specific user
	@GetMapping("/{userid}")
	public ResponseEntity<UserModel> getUser(@PathVariable("userid") Long id) {
		UserModel user = userService.getUser(id);
		if(user==null) {
			throw new UserNotFound("No user found for ID : "+id);
		}
	    return new ResponseEntity<UserModel>(user, HttpStatus.OK);
	}
	
	//purchase plan
	//Create user
	@PostMapping("/purchase")  
	public ResponseEntity<Object> purchase(@RequestBody UserPurchaseModel purchase){	
		Response response = new Response();
		System.out.print(purchase);
		try {
			   userService.purhcasePlan(purchase);
//			   response.setDateTime(LocalDateTime.now());
//			   response.setMessage("Plan subscribed successfully.");
//			   response.setStatus(HttpStatus.CREATED);
			   return new ResponseEntity<Object>(response, HttpStatus.CREATED);
			}catch(Exception e) {
				throw new InternalServerErr("Internal Server Error.");
		 }
	 }
}
