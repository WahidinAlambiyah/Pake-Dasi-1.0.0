package com.root.controller.inquiry;

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

import com.root.controller.transaction.UserBookingController;
import com.root.service.login.LoginService;

@Controller
@RequestMapping("/inquiry")
public class FlightScheduleController {
	
	private static final Log logger = LogFactory.getLog(FlightScheduleController.class);
	private static final String JSON_VIEW_NAME = "common_json_view";
	
	@Autowired
	protected LoginService loginService;
	
	@RequestMapping(value = "/flightScheduleList", method = RequestMethod.POST)
	public ModelAndView flightScheduleList(HttpServletRequest request) {
		
		Map<String, Object> model = new HashMap<String, Object>();
		
		String email = request.getParameter("email") != null ? request.getParameter("email") : "-";
		
		HashMap<String, Object> maps = new HashMap<>();
		maps.put("email", email);
		
		String result = loginService.userRegistration(maps);
		logger.info("response pake-dasi flightScheduleList ? " + result );
		
		model.put("jsonView", result);		
		
		return new ModelAndView(JSON_VIEW_NAME, model);
		
	}

}
