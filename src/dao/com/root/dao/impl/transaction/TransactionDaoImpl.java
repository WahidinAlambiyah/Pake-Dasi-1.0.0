/**
 * 
 */
package com.root.dao.impl.transaction;

import com.root.model.bean.transaction.Transaction;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.root.dao.impl.base.AbstractDAO;

import com.root.dao.transaction.TransactionDao;

/**
 * @author Alen Dec 21, 2016 
 * MasterAirportDaoImpl.java
 * 
 */
@Repository("transactionDao")
@Transactional(readOnly = true)
public class TransactionDaoImpl  extends AbstractDAO<Transaction, Long> implements TransactionDao {
	
	public TransactionDaoImpl()  {
		super(Transaction.class);
	}
	
}
