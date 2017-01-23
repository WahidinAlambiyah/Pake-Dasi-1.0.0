/**
 * 
 */
package com.root.model.util.json;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Alen Dec 21, 2016 
 * FlightScheduleJson.java
 * 
 */
public class FlightListScheduleJson extends BaseResponseJson implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	protected String departureDate;
	protected String arrivalDate;
	protected String departureTime;
	protected String arrivalTime;
	protected String flightNo;
	protected String origin;
	protected String originCode;
	protected String destination;
	protected String destinationCode;
	
	
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getOriginCode() {
		return originCode;
	}
	public void setOriginCode(String originCode) {
		this.originCode = originCode;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDestinationCode() {
		return destinationCode;
	}
	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}	
}
