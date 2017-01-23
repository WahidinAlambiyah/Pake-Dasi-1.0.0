/**
 * 
 */
package com.root.model.util.json;

import java.util.List;


/**
 * @author Alen Dec 21, 2016 
 * HistoryUserTransactionJson.java
 * 
 */
public class HistoryUserTransactionJson extends BaseResponseJson {

	protected String email;
	protected String fullName;
	protected List<HistoryListUserTransactionJson> historyListUserTransactionJson;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public List<HistoryListUserTransactionJson> getHistoryListUserTransactionJson() {
		return historyListUserTransactionJson;
	}
	public void setHistoryListUserTransactionJson(
			List<HistoryListUserTransactionJson> historyListUserTransactionJson) {
		this.historyListUserTransactionJson = historyListUserTransactionJson;
	}

	
}
