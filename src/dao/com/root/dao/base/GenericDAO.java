package com.root.dao.base;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
public interface GenericDAO <T, ID extends Serializable> {

	public SessionFactory getSessionFactory();
    
	void save (T entity);
    
	void delete (T entity);
    
	T findByPrimaryKey (ID id);
    
	public List<T> load(final Order order, final Criterion... criterion);
    
	public List<T> loadAll();
    
	public void setEntityClass(Class<T> entityClass);
    
	public List<T> getByCriteria(T entity);

	public List<T> load(int first, int max,final Order order, final Criterion... criterion);
	
}
