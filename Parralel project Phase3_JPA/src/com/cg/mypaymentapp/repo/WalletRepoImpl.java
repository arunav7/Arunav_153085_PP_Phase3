package com.cg.mypaymentapp.repo;

import java.sql.SQLException;

import javax.persistence.EntityManager;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.exception.MobileNumberNotRegistered;
import com.cg.mypaymentapp.util.JPAUtil;

public class WalletRepoImpl implements WalletRepo {

	private EntityManager entityManager;
	
	public WalletRepoImpl() {
	
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public boolean save(Customer customer) throws SQLException, ClassNotFoundException {
		
		/*String mobNO = customer.getMobileNo();
		
		if(findOne(mobNO) != null)
			throw new MobileNumberNotRegistered("Account is already registered with mobile number: " + mobNO);*/
		
		try {
			
			entityManager.persist(customer);
			
		} catch(MobileNumberNotRegistered mobileEX) {
			
			throw new MobileNumberNotRegistered(mobileEX.getMessage());
		}
		
		return true;
	}

	@Override
	public Customer findOne(String mobileNo) throws ClassNotFoundException, SQLException {
		
		Customer customer = entityManager.find(Customer.class, mobileNo);
		
		if(customer == null)
			return null;
		
		return customer;
	}

	@Override
	public void startTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

}
