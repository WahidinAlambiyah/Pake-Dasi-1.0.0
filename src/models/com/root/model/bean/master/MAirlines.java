/**
 * 
 */
package com.root.model.bean.master;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Alen Dec 21, 2016 
 * Users.java
 * 
 */


@Entity
@Table(name="m_airlines")
public class MAirlines implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_airline")
	private Long idAirline;
	
	@Column(name="name_airline", length=45)
	private String nameAirline;
	

	public Long getIdAirline() {
		return idAirline;
	}

	public void setIdAirline(Long idAirline) {
		this.idAirline = idAirline;
	}

	public String getNameAirline() {
		return nameAirline;
	}

	public void setNameAirline(String nameAirline) {
		this.nameAirline = nameAirline;
	}	
	
}
