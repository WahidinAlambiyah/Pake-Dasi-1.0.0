/**
 * 
 */
package com.root.dao.impl.transaction;

import com.root.model.bean.transaction.Users;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.root.dao.impl.base.AbstractDAO;

import com.root.dao.transaction.UsersDao;

/**
 * @author Alen Dec 21, 2016 
 * MasterAirportDaoImpl.java
 * 
 */
@Repository("usersDao")
@Transactional(readOnly = true)
public class UsersDaoImpl  extends AbstractDAO<Users, Long> implements UsersDao {
	
	public UsersDaoImpl()  {
		super(Users.class);
	}
	
}
