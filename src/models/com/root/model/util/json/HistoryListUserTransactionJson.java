/**
 * 
 */
package com.root.model.util.json;

import java.util.Date;


/**
 * @author Alen Dec 21, 2016 
 * HistoryUserTransactionJson.java
 * 
 */
public class HistoryListUserTransactionJson extends BaseResponseJson {

	protected String flightNumber;
	protected Date orderDate;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}	
}
