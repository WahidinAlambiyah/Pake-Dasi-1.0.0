/**
 * 
 */
package com.root.dao.impl.master;

import com.root.model.bean.master.MAirlines;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.root.dao.impl.base.AbstractDAO;

import com.root.dao.master.MAirlinesDao;

/**
 * @author Alen Jan 16, 2017 
 * MAirlinesDaoImpl.java
 * 
 */
@Repository("mAirlinesDao")
@Transactional(readOnly = true)
public class MAirlinesDaoImpl  extends AbstractDAO<MAirlines, Long> implements MAirlinesDao {
	
	public MAirlinesDaoImpl()  {
		super(MAirlines.class);
	}
	
}
