/**
 * 
 */
package com.root.model.util.json;

import java.io.Serializable;

/**
 * @author Padicon
 *
 */
public class BaseResponseJson implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String respCode;
	protected String inRespMsg;
	protected String enRespMsg;
	protected String techRespMsg;
	
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getInRespMsg() {
		return inRespMsg;
	}
	public void setInRespMsg(String inRespMsg) {
		this.inRespMsg = inRespMsg;
	}
	public String getEnRespMsg() {
		return enRespMsg;
	}
	public void setEnRespMsg(String enRespMsg) {
		this.enRespMsg = enRespMsg;
	}
	public String getTechRespMsg() {
		return techRespMsg;
	}
	public void setTechRespMsg(String techRespMsg) {
		this.techRespMsg = techRespMsg;
	}
	
	


	
}
