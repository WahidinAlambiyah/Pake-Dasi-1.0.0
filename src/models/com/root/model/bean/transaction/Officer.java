/**
 * 
 */
package com.root.model.bean.transaction;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * @author Alen Jan 16, 2017 
 * Officer.java
 * 
 */

@Entity
@Table(name="officer")
public class Officer  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_officer")
	private Long idOfficer;
	
	@Column(name="user_name", length=45)
	private String userName;
	
	@Column(name="password", length=45)
	private String password;

	@Column(name="email", length=45)
	private String email;
	
	@Column(name="hp", length=45)
	private String hp;
	
	@Column(name="photo")
	@Type(type="text")
	private String photo;
	
	//POSITION SHOULD BE ENUMERATED
	@Enumerated(EnumType.ORDINAL)
	private Position position;
	
	public enum Position {
	    InGate, Collector, Courier
	}
	
	public Long getIdOfficer() {
		return idOfficer;
	}

	public void setIdOfficer(Long idOfficer) {
		this.idOfficer = idOfficer;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
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

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	
}
