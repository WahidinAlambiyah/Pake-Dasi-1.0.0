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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Alen Dec 21, 2016 
 * MasterAirport.java
 * 
 */

@Entity
@Table(name="m_airport")
public class MAirport implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_airport")
	private Long idAirport;
	
	@Column(name="name_airport", length=45)
	private String nameAirport;
		
	@Column(name="code_airport", length=3)
	private String codeAiport;
	
	@ManyToOne
	@JoinColumn(name="id_city", referencedColumnName = "id_city")
	private MCity mCity;

	@Column(name="latitude", length=10)
	private String latitude;

	@Column(name="longitude", length=10)
	private String longitude;

	
	public Long getIdAirport() {
		return idAirport;
	}

	public void setIdAirport(Long idAirport) {
		this.idAirport = idAirport;
	}

	public String getNameAirport() {
		return nameAirport;
	}

	public void setNameAirport(String nameAirport) {
		this.nameAirport = nameAirport;
	}

	public MCity getmCity() {
		return mCity;
	}

	public void setmCity(MCity mCity) {
		this.mCity = mCity;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getCodeAiport() {
		return codeAiport;
	}

	public void setCodeAiport(String codeAiport) {
		this.codeAiport = codeAiport;
	}
	
}
