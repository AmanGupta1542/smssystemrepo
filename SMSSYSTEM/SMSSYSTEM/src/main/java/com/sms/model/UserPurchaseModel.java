package com.sms.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name="userpurchase")
@Table(name="userpurchase")
public class UserPurchaseModel {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long userid;
	private Long smsplan;
	private String credits;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
    private Date puschase_date;

	public UserPurchaseModel() {
		
	}
	public UserPurchaseModel(Long id, Long userid, Long smsplan, String credits, Date puschase_date) {
		super();
		this.id = id;
		this.userid = userid;
		this.smsplan = smsplan;
		this.credits = credits;
		this.puschase_date = puschase_date;
	}

	public Long getId() {
		return id;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Long getSmsplan() {
		return smsplan;
	}

	public void setSmsplan(Long smsplan) {
		this.smsplan = smsplan;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}

	public Date getPuschase_date() {
		return puschase_date;
	}

	public void setPuschase_date(Date puschase_date) {
		this.puschase_date = puschase_date;
	}

	@Override
	public String toString() {
		return "UserPurchaseModel [id=" + id + ", userid=" + userid + ", smsplan=" + smsplan + ", credits=" + credits
				+ ", puschase_date=" + puschase_date + "]";
	} 
	
}
