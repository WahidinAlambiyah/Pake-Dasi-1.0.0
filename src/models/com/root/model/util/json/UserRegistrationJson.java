/**
 * 
 */
package com.root.model.util.json;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Alen Dec 21, 2016 
 * UserRegistrationJson.java
 * 
 */
public class UserRegistrationJson extends BaseResponseJson implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	protected String userName;
	protected String password;
	protected String email;
	protected String phoneNumber;
	protected String activeUser;
	
	protected String orderStatus;
	protected String flightNumber;
	protected String orderDate;
	
	
	public String getPassword() {
		return password;
	}
	public String getActiveUser() {
		return activeUser;
	}
	public void setActiveUser(String activeUser) {
		this.activeUser = activeUser;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
}
