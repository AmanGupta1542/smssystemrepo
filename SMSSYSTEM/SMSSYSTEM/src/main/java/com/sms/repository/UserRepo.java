package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Long>{

}
