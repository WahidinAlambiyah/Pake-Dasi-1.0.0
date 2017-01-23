/**
 * 
 */
package com.root.model.bean.transaction;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.root.model.bean.master.MAirlines;

import com.root.model.bean.master.MAirport;

/**
 * @author Alen Jan 16, 2017 
 * Flight.java
 * 
 */
@Entity
@Table(name="flight")
public class Flight implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_flight")
	private Long idFlight;
	
	@ManyToOne
	@JoinColumn(name="id_airline", referencedColumnName = "id_airline")
	private MAirlines mAirlines;
	
    @ManyToOne
    @JoinColumn(name="departure_airport_id", referencedColumnName = "id_airport")
    private MAirport departureAirportId;
	
	@Temporal( TemporalType.TIMESTAMP)
 	@Column(name="departure_time")
 	private Date departureTime;
	
    @ManyToOne
    @JoinColumn(name="arrival_airport_id", referencedColumnName = "id_airport")
    private MAirport arrivalAirportId;
    
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="arrival_time")
	private Date arrivalTime;

	public Long getIdFlight() {
		return idFlight;
	}

	public void setIdFlight(Long idFlight) {
		this.idFlight = idFlight;
	}

	public MAirlines getmAirlines() {
		return mAirlines;
	}

	public void setmAirlines(MAirlines mAirlines) {
		this.mAirlines = mAirlines;
	}

	public MAirport getDepartureAirportId() {
		return departureAirportId;
	}

	public void setDepartureAirportId(MAirport departureAirportId) {
		this.departureAirportId = departureAirportId;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public MAirport getArrivalAirportId() {
		return arrivalAirportId;
	}

	public void setArrivalAirportId(MAirport arrivalAirportId) {
		this.arrivalAirportId = arrivalAirportId;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}	
		
}
