/**
 * 
 */
package com.root.service.impl.login;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;

import com.root.model.bean.transaction.Users;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.padicon.common.util.PropertyMessageUtil;
import com.root.dao.transaction.TransactionDao;
import com.root.dao.transaction.UsersDao;
import com.root.model.util.json.UserRegistrationJson;
import com.root.service.login.LoginService;

/**
 * @author Alen Jan 16, 2017 
 * LoginServiceImpl.java
 * 
 */
@Service(value="loginService")
public class LoginServiceImpl implements LoginService {
	private static final Log logger = LogFactory.getLog(LoginServiceImpl.class);
	
	@Autowired
	@Qualifier("usersDao")
	private UsersDao usersDao;

	@Autowired
	@Qualifier("transactionDao")
	private TransactionDao transactionDao;
	
	
	private static StringBuffer encryptPass(String pass) throws NoSuchAlgorithmException {
		
		//I'm using MD5(32) method, rather than SHA-256(64)
		MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(pass.getBytes());

        byte passEncrypted[] = md.digest();

		System.out.println("passEncrypted : " + passEncrypted);

        //convert the byte to hex format 
        StringBuffer buff = new StringBuffer();
        for (int i = 0; i < passEncrypted.length; i++) {
        	buff.append(Integer.toString((passEncrypted[i] & 0xff) + 0x100, 16).substring(1));
        }
				
				
		return buff;
	}
	
	public String userRegistration(HashMap<String, Object> obj)  {
		
		String response = "";
		String codeMsg = "";
		
		UserRegistrationJson userRegistrationJson = new UserRegistrationJson();
		
		try {
			/**NECCESSARY VARIABLE*/
			String userName = (String) obj.get("userName");
			String password = (String) obj.get("password");
			String email = (String) obj.get("email");
			String phoneNumber = (String) obj.get("phoneNumber");
			
			logger.info("userName  : " + userName);
			logger.info("password  : " + password);
			logger.info("email  : " + email);
			logger.info("phoneNumber  : " + phoneNumber);
						
			Criterion criterionUser = Restrictions.eq("email",email);
			
			List<Users> listUsers = usersDao.load(Order.asc("idUser"), criterionUser);
			logger.info("listMasterUser  Size : " + listUsers.size());
			if (listUsers.size() == 0) {
				
				StringBuffer encry = this.encryptPass(password);
		        
		        String passEncry = encry.toString();
		        System.out.println(" passEncry : " + passEncry);
		        System.out.println(" passEncry : " + passEncry.length());
				
				Users users = new Users();
				users.setEmail(email);
				users.setUserName(userName);
				users.setHp(phoneNumber);
				users.setPassword(passEncry);
				usersDao.save(users);
				
				userRegistrationJson.setEmail(email);
				userRegistrationJson.setUserName(userName);
				userRegistrationJson.setPassword(password);
				userRegistrationJson.setPhoneNumber(phoneNumber);
				userRegistrationJson.setActiveUser("Y");
				
				
				codeMsg = PropertyMessageUtil.getMessageProperties().getProperty("code.msg.10000");
				
			} else {
				codeMsg = PropertyMessageUtil.getMessageProperties().getProperty("code.msg.10001");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.info(" Error  : " + e.getMessage());
			codeMsg = PropertyMessageUtil.getMessageProperties().getProperty("code.msg.99999");
		}
		
		userRegistrationJson.setRespCode(codeMsg);
		userRegistrationJson.setEnRespMsg(PropertyMessageUtil.getMessageProperties().getProperty("en.msg."+ codeMsg));
		userRegistrationJson.setInRespMsg(PropertyMessageUtil.getMessageProperties().getProperty("in.msg." + codeMsg ));
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		response = gson.toJson(userRegistrationJson);
		
		return response;
	}
	
	public String userLogin(HashMap<String, Object> obj)  {
		
		String response = "";
		String codeMsg = "";
		
		UserRegistrationJson userRegistrationJson = new UserRegistrationJson();
		
		try {
			/**NECCESSARY VARIABLE*/
			String email = (String) obj.get("email");
			String password = (String) obj.get("password");
			
			logger.info("email  : " + email);
			logger.info("password  : " + password);
						
			Criterion criterionUser1 = Restrictions.eq("email",email);
//			Criterion criterionUser2 = Restrictions.eq("password",password);
			
			List<Users> listUsers = usersDao.load(Order.asc("idUser"), criterionUser1);
			System.out.println("listMasterUser  Size : " + listUsers.size());
			if (listUsers.size() > 0) {
				
				
				StringBuffer encry = this.encryptPass(password);
		        String passEncry = encry.toString();
		        System.out.println("passEncry : " + passEncry);
		        System.out.println("listUsers.get(0).getPassword() : " + listUsers.get(0).getPassword());
		        
		        if (listUsers.get(0).getPassword().equals(passEncry)) {
		        	
		        	listUsers.get(0).getPassword();
					codeMsg = PropertyMessageUtil.getMessageProperties().getProperty("code.msg.0");
					
					userRegistrationJson.setEmail(email);
					userRegistrationJson.setUserName(listUsers.get(0).getUserName());
		        
		        } else {
		        	codeMsg = PropertyMessageUtil.getMessageProperties().getProperty("code.msg.11001");
		        }
				
			} else {
				codeMsg = PropertyMessageUtil.getMessageProperties().getProperty("code.msg.11000");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.info(" Error  : " + e.getMessage());
			codeMsg = PropertyMessageUtil.getMessageProperties().getProperty("code.msg.99999");
		}
		
		userRegistrationJson.setRespCode(codeMsg);
		userRegistrationJson.setEnRespMsg(PropertyMessageUtil.getMessageProperties().getProperty("en.msg."+ codeMsg));
		userRegistrationJson.setInRespMsg(PropertyMessageUtil.getMessageProperties().getProperty("in.msg." + codeMsg ));
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		response = gson.toJson(userRegistrationJson);
		
		return response;
	}
	
	
}
