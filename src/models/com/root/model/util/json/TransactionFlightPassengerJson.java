/**
 * 
 */
package com.root.model.util.json;

import java.io.Serializable;

/**
 * @author Alen Dec 21, 2016 
 * TransactionFlightPassengerJson.java
 * 
 */
public class TransactionFlightPassengerJson extends BaseResponseJson implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	protected String userName;
	protected String idNumber;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	
	
}
