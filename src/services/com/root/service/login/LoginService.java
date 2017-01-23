/**
 * 
 */
package com.root.service.login;

import java.util.HashMap;

/**
 * @author Alen Jan 16, 2017 
 * LoginService.java
 * 
 */
public interface LoginService {
	public String userRegistration(HashMap<String, Object> obj);
	public String userLogin(HashMap<String, Object> obj);
	public String officerLogin(HashMap<String, Object> obj);
}
