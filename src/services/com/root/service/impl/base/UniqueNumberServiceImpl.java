/**
 * 
 */
package com.root.service.impl.base;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.padicon.common.util.DateUtils;
import com.root.dao.base.UniqueNumberDao;
import com.root.model.bean.base.UniqueNumber;
import com.root.service.base.UniqueNumberService;

/**
 * @author Padicon
 *
 */
@Service(value="uniqueNumberService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UniqueNumberServiceImpl  implements UniqueNumberService  {
	
	private static final Log logger = LogFactory.getLog(UniqueNumberServiceImpl.class);	
		
	@Autowired
	@Qualifier("uniqueNumberDao")
	private UniqueNumberDao uniqueNumberDao;


	@Override
	public UniqueNumber getTransactionCode() {
		String thnBlnTgl = DateUtils.dateToyyyyMMddString(new Date());
		
		UniqueNumber un = new UniqueNumber();
		un.setTrnDate(thnBlnTgl);		
		List<UniqueNumber> uniqNumberLst = uniqueNumberDao.getByCriteria(un);
		
		Integer counter = 0;

		if (uniqNumberLst.size() > 0 )
		{
			un = uniqNumberLst.get(0);
			counter = un.getCounter() + 1;
			
			un.setCounter(counter);
			
		}else
		{
			counter = 1;
		}
	
		String thnBlnTglyymmdd = DateUtils.dateToyyyyMMddhhmmssString(new Date());
	
		String idUn = counter.toString();
		String idNumber = "0000" + idUn;  
				
		Random aRandom = new Random(System.currentTimeMillis());
		long numberRandom = aRandom.nextInt(900) + 100;
		
		String random = String.valueOf(numberRandom);
		
//		String number = thnBlnTglyymmdd.substring(2,8) + random + idNumber.substring(idNumber.length() - 4);
		String number = "ROOTAPA" + random + idNumber.substring(idNumber.length() - 4);

		un.setCounter(counter);
		un.setNumber(number);
		logger.info(" getNumber : " + un);
		uniqueNumberDao.save(un);
	
		
		//return un;
		return un;
	}



}
