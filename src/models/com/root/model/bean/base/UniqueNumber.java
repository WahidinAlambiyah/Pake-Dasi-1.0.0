
package com.root.model.bean.base;

import java.io.Serializable;
import javax.persistence.*;

/**
 * 
 * @author Alen Dec 21, 2016 
 * UniqueNumber.java
 * 
 */

/**
 * Entity implementation class for Entity: UniqueNumber
 *
 */
@Entity
@Table(name="uniquenumber")
public class UniqueNumber implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="unique_number_id")
	Long uniqueNumberId;
	
	@Column(length=20)
	String number;
	
	@Column(name="trn_date",length=8)
	String trnDate;
	
	@Column(name="counter")
	Integer counter;	
	
	

	public UniqueNumber() {
		super();
	}

	public Long getUniqueNumberId() {
		return uniqueNumberId;
	}

	public void setUniqueNumberId(Long uniqueNumberId) {
		this.uniqueNumberId = uniqueNumberId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "UniqueNumber [uniqueNumberId=" + uniqueNumberId + ", number="
				+ number + ", trnDate=" + trnDate + ", counter=" + counter
				+ "]";
	}

	public String getTrnDate() {
		return trnDate;
	}

	public void setTrnDate(String trnDate) {
		this.trnDate = trnDate;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}
	
	
   
}
