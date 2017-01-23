/**
 * 
 */
package com.root.controller.login;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.root.service.login.LoginService;

/**
 * @author Alen Jan 16, 2017 
 * UserLogin.java
 * 
 */
@Controller
@RequestMapping("/user")
public class UserLoginController {
	private static final Log logger = LogFactory.getLog(UserLoginController.class);
	private static final String JSON_VIEW_NAME = "common_json_view";
	
	@Autowired
	protected LoginService loginService;
	
	@RequestMapping(value = "/userRegistration", method = RequestMethod.POST)
	public ModelAndView userRegistration(HttpServletRequest request) {
		
		Map<String, Object> model = new HashMap<String, Object>();
		
		String userName = request.getParameter("userName") != null ? request.getParameter("userName") : "-";
		String password = request.getParameter("password") != null ? request.getParameter("password") : "-";
		String email = request.getParameter("email") != null ? request.getParameter("email") : "";
		String phoneNumber = request.getParameter("phoneNumber") != null ? request.getParameter("phoneNumber") : "";
		
		HashMap<String, Object> maps = new HashMap<>();
		maps.put("userName", userName);
		maps.put("password", password);
		maps.put("email", email);
		maps.put("phoneNumber", phoneNumber);
		
		String result = loginService.userRegistration(maps);
		logger.info("response pake-dasi userRegistration ? " + result );
		
		model.put("jsonView", result);		
		
		return new ModelAndView(JSON_VIEW_NAME, model);
		
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public ModelAndView userLogin(HttpServletRequest request) {
		
		Map<String, Object> model = new HashMap<String, Object>();

		String email = request.getParameter("email") != null ? request.getParameter("email") : "";
		String password = request.getParameter("password") != null ? request.getParameter("password") : "-";
		
		HashMap<String, Object> maps = new HashMap<>();
		maps.put("email", email);
		maps.put("password", password);
		
		String result = loginService.userLogin(maps);
		logger.info("response pake-dasi userLogin ? " + result );
		
		model.put("jsonView", result);		
		
		return new ModelAndView(JSON_VIEW_NAME, model);
		
	}
	
}
