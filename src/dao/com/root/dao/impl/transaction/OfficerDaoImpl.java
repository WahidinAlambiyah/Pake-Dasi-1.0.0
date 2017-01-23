/**
 * 
 */
package com.root.dao.impl.transaction;

import com.root.model.bean.transaction.Officer;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.root.dao.impl.base.AbstractDAO;

import com.root.dao.transaction.OfficerDao;

/**
 * @author Alen Dec 21, 2016 
 * MasterAirportDaoImpl.java
 * 
 */
@Repository("officerDao")
@Transactional(readOnly = true)
public class OfficerDaoImpl  extends AbstractDAO<Officer, Long> implements OfficerDao {
	
	public OfficerDaoImpl()  {
		super(Officer.class);
	}
	
}
