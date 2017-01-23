/**
 * 
 */
package com.root.model.util.json;

import java.io.Serializable;

/**
 * @author wahidin-alambiyah-19.blogspot.com
 * 20 Jan 2017
 */
public class OfficerLoginJson extends BaseResponseJson implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long idOfficer;
	private String username;
	private String password;
	private String email;
	private String noHP;
	private String position;
	
	public Long getIdOfficer() {
		return idOfficer;
	}
	public void setIdOfficer(Long idOfficer) {
		this.idOfficer = idOfficer;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getNoHP() {
		return noHP;
	}
	public void setNoHP(String noHP) {
		this.noHP = noHP;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
}
