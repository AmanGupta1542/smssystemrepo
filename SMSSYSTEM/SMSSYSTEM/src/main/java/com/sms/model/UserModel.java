package com.sms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String gmail;
	private String mobile;
	private String cetagory;
	private Boolean status;
	
	public UserModel() {
		
	}
	public UserModel(long id, String name, String gmail, String mobile, String cetagory, Boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.gmail = gmail;
		this.mobile = mobile;
		this.cetagory = cetagory;
		this.status = status;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCetagory() {
		return mobile;
	}
	public void getCetagory(String cetagory) {
		this.cetagory = cetagory;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", gmail=" + gmail + ", mobile=" + mobile + ", status="
				+ status + "]";
	}
	
}
