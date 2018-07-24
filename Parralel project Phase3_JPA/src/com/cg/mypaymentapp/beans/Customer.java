package com.cg.mypaymentapp.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 8166615222405189202L;

	@Id
	//@GeneratedValue
	private String mobileNo;
	
	private Integer customerID;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="walletID")
	private Wallet wallet;

	public Customer() {
		super();
	}

	public Customer(String mobileNo, String name, Wallet wallet) {
		super();
		this.mobileNo = mobileNo;
		this.name = name;
		this.wallet = wallet;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "Customer [Name: " + name + ", Mobile No: " + mobileNo + wallet + "]";
	}
	
}


