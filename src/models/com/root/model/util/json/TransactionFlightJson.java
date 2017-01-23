/**
 * 
 */
package com.root.model.util.json;

import java.io.Serializable;
import java.util.List;

/**
 * @author Alen Dec 21, 2016 
 * TransactionFlightJson.java
 * 
 */
public class TransactionFlightJson extends BaseResponseJson implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	

	protected String transactionCode;
	protected String passengerCount;
	protected String destinationCode;
	protected String originCode;
	protected String destination;
	protected String origin;
	
	protected String officerName;
	protected String officerRate;
	protected String officerPrivilege;
	protected String officerStatus;
	
	protected String bookingNumber;
	protected String flightNo;
	protected String passengerHandler;
	protected List<TransactionFlightPassengerJson> transactionFlightPassengerJson;
	protected String baggageStatus;
	protected String price;
	
	
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(String passengerCount) {
		this.passengerCount = passengerCount;
	}
	public String getDestinationCode() {
		return destinationCode;
	}
	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
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
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getOfficerName() {
		return officerName;
	}
	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}
	public String getOfficerRate() {
		return officerRate;
	}
	public void setOfficerRate(String officerRate) {
		this.officerRate = officerRate;
	}
	public String getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getPassengerHandler() {
		return passengerHandler;
	}
	public void setPassengerHandler(String passengerHandler) {
		this.passengerHandler = passengerHandler;
	}
	public List<TransactionFlightPassengerJson> getTransactionFlightPassengerJson() {
		return transactionFlightPassengerJson;
	}
	public void setTransactionFlightPassengerJson(
			List<TransactionFlightPassengerJson> transactionFlightPassengerJson) {
		this.transactionFlightPassengerJson = transactionFlightPassengerJson;
	}
	public String getBaggageStatus() {
		return baggageStatus;
	}
	public void setBaggageStatus(String baggageStatus) {
		this.baggageStatus = baggageStatus;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOfficerStatus() {
		return officerStatus;
	}
	public void setOfficerStatus(String officerStatus) {
		this.officerStatus = officerStatus;
	}
	public String getOfficerPrivilege() {
		return officerPrivilege;
	}
	public void setOfficerPrivilege(String officerPrivilege) {
		this.officerPrivilege = officerPrivilege;
	}
}
