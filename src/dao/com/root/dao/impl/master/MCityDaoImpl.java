/**
 * 
 */
package com.root.dao.impl.master;

import com.root.model.bean.master.MCity;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.root.dao.impl.base.AbstractDAO;

import com.root.dao.master.MCityDao;

/**
 * @author Alen Dec 21, 2016 
 * MasterAirportDaoImpl.java
 * 
 */
@Repository("mCity")
@Transactional(readOnly = true)
public class MCityDaoImpl  extends AbstractDAO<MCity, Long> implements MCityDao {
	
	public MCityDaoImpl()  {
		super(MCity.class);
	}
	
}
