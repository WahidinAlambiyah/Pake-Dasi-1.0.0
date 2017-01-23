package com.root.dao.impl.base;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.root.dao.base.GenericDAO;

public abstract class AbstractDAO <T, ID extends Serializable> implements GenericDAO <T,ID> {
    
	 //   protected HibernateTemplate hibernateTemplate;
    @Autowired
    protected SessionFactory sessionFactory;
    
    private  Class<T> entityClass;

	public AbstractDAO(Class<T> c){entityClass =c;}
    
	 public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}    
    
	 public SessionFactory getSessionFactory()
	 {
			 return sessionFactory;	 
	 }; 
	 
	 
	 @Transactional( readOnly=false)
    public void save(T entity) {	 
    	Session session = sessionFactory.getCurrentSession();
	    Transaction tx = session.beginTransaction();

 	 try {
 
 		    session.saveOrUpdate(entity);
 		    tx.commit();
 		}
 		catch (RuntimeException e) {
 			session.getTransaction().rollback();
 		    throw e;
 		}
    }
   
	@Transactional(readOnly=false)
    public void delete (T entity){
    	 Session session = sessionFactory.getCurrentSession();
	    	Transaction tx = session.beginTransaction();

 	 try {
 
 		    session.delete(entity);
 		    tx.commit();
 		}
 		catch (RuntimeException e) {
 			session.getTransaction().rollback();
 		    throw e;
 		}
    }
    
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
    public T findByPrimaryKey (ID id){
		
		Session session = sessionFactory.getCurrentSession();
	  //  Transaction tx = session.beginTransaction();
	    
	    T model = (T) session.load(entityClass, id);
	   // tx.commit();
        return model;
    }
	
	  @SuppressWarnings("unchecked")
	    @Override
	    @Transactional(propagation = Propagation.SUPPORTS, readOnly=true)
	    public List<T> load(int first, int max, final Order order, final Criterion... criterion) {
	              
	    	Session session = sessionFactory.getCurrentSession();
		 //   Transaction tx = session.beginTransaction();
		    
	        Criteria criteria = session.createCriteria(entityClass);
	        
	        if (criterion != null){
	    
	            for (Criterion crit : criterion){
	                criteria.add(crit);
	            }
	        }
	        
	        if (order != null){
	        
	            criteria.addOrder(order);
	        }
	        
	        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
	        criteria.setFirstResult(first);
	        criteria.setMaxResults(max);

	        List<T> modelLst = criteria.list();
	     //   tx.commit();
	        
	        return modelLst;
	    
	    }
    
    @SuppressWarnings("unchecked")
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly=true)
    public List<T> load(final Order order, final Criterion... criterion) {
              
    	Session session = sessionFactory.getCurrentSession();
	 //   Transaction tx = session.beginTransaction();
	    
        Criteria criteria = session.createCriteria(entityClass);
        
        if (criterion != null){
    
            for (Criterion crit : criterion){
                criteria.add(crit);
            }
        }
        
        if (order != null){
        
            criteria.addOrder(order);
        }
        
        List<T> modelLst = criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     //   tx.commit();
        
        return modelLst;
    
    }
    
    @SuppressWarnings("unchecked")
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly=true)
    public List<T> loadAll() {
               
    	Session session = sessionFactory.getCurrentSession();
	//    Transaction tx = session.beginTransaction();
	    
        Criteria criteria = session.createCriteria(entityClass);
        
        List<T> modelLst = criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     //   tx.commit();
        
        return modelLst;
 
    }
    
    public void setEntityClass(Class<T> entityClass){
        this.entityClass = entityClass;
    }
    
    
    @Override
	public List<T> getByCriteria(T obj) {
		// TODO Auto-generated method stub
		Example example = Example.create(obj)
        .enableLike(MatchMode.ANYWHERE)
        .excludeZeroes()
        .ignoreCase();
		
		return load(null, example);
	}
    
  
}
