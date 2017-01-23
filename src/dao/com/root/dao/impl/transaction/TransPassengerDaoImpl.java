/**
 * 
 */
package com.root.dao.impl.transaction;

import com.root.model.bean.transaction.TransPassenger;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.root.dao.impl.base.AbstractDAO;

import com.root.dao.transaction.TransPassengerDao;

/**
 * @author Alen Dec 21, 2016 
 * MasterAirportDaoImpl.java
 * 
 */
@Repository("transPassengerDao")
@Transactional(readOnly = true)
public class TransPassengerDaoImpl  extends AbstractDAO<TransPassenger, Long> implements TransPassengerDao {
	
	public TransPassengerDaoImpl()  {
		super(TransPassenger.class);
	}
	
}
