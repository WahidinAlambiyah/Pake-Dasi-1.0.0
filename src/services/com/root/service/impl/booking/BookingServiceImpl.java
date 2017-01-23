package com.root.service.impl.booking;

import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.root.dao.transaction.TransactionDao;
import com.root.dao.transaction.UsersDao;
import com.root.service.booking.BookingService;

@Service(value="bookingService")
public class BookingServiceImpl implements BookingService {
	
	private static final Log logger = LogFactory.getLog(BookingServiceImpl.class);
	
	@Autowired
	@Qualifier("usersDao")
	private UsersDao usersDao;

	@Autowired
	@Qualifier("transactionDao")
	private TransactionDao transactionDao;
	
	public String userBooking(HashMap<String, Object> obj)  {
		return null;
	}
	
}
