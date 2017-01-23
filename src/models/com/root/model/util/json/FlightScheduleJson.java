/**
 * 
 */
package com.root.model.util.json;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Alen Dec 21, 2016 
 * FlightScheduleJson.java
 * 
 */
public class FlightScheduleJson extends BaseResponseJson implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	protected String email;
	protected String password;
	protected List<FlightListScheduleJson> flightListScheduleJson;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<FlightListScheduleJson> getFlightListScheduleJson() {
		return flightListScheduleJson;
	}
	public void setFlightListScheduleJson(
			List<FlightListScheduleJson> flightListScheduleJson) {
		this.flightListScheduleJson = flightListScheduleJson;
	}
	
	
}
