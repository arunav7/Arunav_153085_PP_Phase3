package com.cg.mypaymentapp.beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wallet implements Serializable {
	private static final long serialVersionUID = 3480868867683830340L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="walletID")
	private Integer walletID;
	
	private BigDecimal balance;

	public Wallet(BigDecimal amount) {
		this.balance=amount;
	}


	public BigDecimal getBalance() {
		return balance;
	}


	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return ", balance="+balance;
	}
}
