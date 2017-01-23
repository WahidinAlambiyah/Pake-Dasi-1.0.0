/**
 * 
 */
package com.root.dao.impl.master;

import com.root.model.bean.master.MAirport;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.root.dao.impl.base.AbstractDAO;

import com.root.dao.master.MAirportDao;

/**
 * @author Alen Dec 21, 2016 
 * MasterAirportDaoImpl.java
 * 
 */
@Repository("mAirportDao")
@Transactional(readOnly = true)
public class MAirportDaoImpl  extends AbstractDAO<MAirport, Long> implements MAirportDao {
	
	public MAirportDaoImpl()  {
		super(MAirport.class);
	}
	
}
