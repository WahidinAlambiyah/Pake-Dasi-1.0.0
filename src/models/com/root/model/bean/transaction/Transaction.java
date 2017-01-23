/**
 * 
 */
package com.root.model.bean.transaction;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * @author Alen Jan 16, 2017 
 * Transaction.java
 * 
 */

@Entity
@Table(name="transaction")
public class Transaction  implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_transaction")
	private Long idTransaction;
	
	@OneToMany(mappedBy = "transaction" , cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<TransPassenger> transPassenger;
	
	@ManyToOne
	@JoinColumn(name="id_user", referencedColumnName = "id_user")
	private Users users;

	@ManyToOne
	@JoinColumn(name="id_flight", referencedColumnName = "id_flight")
	private Flight flight;
	
	@ManyToOne
	@JoinColumn(name="id_officer", referencedColumnName = "id_officer")
	private Officer officer;		
		
	@Column(name="booking_code", length=45)
	private String bookingCode;
	
	@Enumerated(EnumType.STRING)
	private Baggage baggage;
	
	public enum Baggage {
	    Y, N
	}

	public Long getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(Long idTransaction) {
		this.idTransaction = idTransaction;
	}

	public List<TransPassenger> getTransPassenger() {
		return transPassenger;
	}

	public void setTransPassenger(List<TransPassenger> transPassenger) {
		this.transPassenger = transPassenger;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Officer getOfficer() {
		return officer;
	}

	public void setOfficer(Officer officer) {
		this.officer = officer;
	}

	public String getBookingCode() {
		return bookingCode;
	}

	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
	}

	public Baggage getBaggage() {
		return baggage;
	}

	public void setBaggage(Baggage baggage) {
		this.baggage = baggage;
	}	
}
