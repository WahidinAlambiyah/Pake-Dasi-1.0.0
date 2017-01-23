package com.root.controller.transaction;

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

import com.root.controller.login.UserLoginController;
import com.root.service.login.LoginService;

@Controller
@RequestMapping("/booking")
public class UserBookingController {
	
	private static final Log logger = LogFactory.getLog(UserBookingController.class);
	private static final String JSON_VIEW_NAME = "common_json_view";
	
	@Autowired
	protected LoginService loginService;
	
	@RequestMapping(value = "/userBooking", method = RequestMethod.POST)
	public ModelAndView userBooking(HttpServletRequest request) {
		
		Map<String, Object> model = new HashMap<String, Object>();
		
		String bookingNumber = request.getParameter("bookingNumber") != null ? request.getParameter("bookingNumber") : "-";
		String flightNumber = request.getParameter("flightNumber") != null ? request.getParameter("flightNumber") : "-";
		String baggage = request.getParameter("baggage") != null ? request.getParameter("baggage") : "";
		String passengerData = request.getParameter("passengerData") != null ? request.getParameter("passengerData") : "";
		
		HashMap<String, Object> maps = new HashMap<>();
		maps.put("bookingNumber", bookingNumber);
		maps.put("flightNumber", flightNumber);
		maps.put("baggage", baggage);
		maps.put("passengerData", passengerData);
		
		String result = loginService.userRegistration(maps);
		logger.info("response pake-dasi booking ? " + result );
		
		model.put("jsonView", result);		
		
		return new ModelAndView(JSON_VIEW_NAME, model);
		
	}

}
