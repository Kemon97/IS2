package com.mipresupuesto.personalbudget.crosscutting.exception;

import static com.mipresupuesto.personalbudget.crosscutting.UtilText.trim;
import static com.mipresupuesto.personalbudget.crosscutting.UtilObject.getUtilObject;

public class GeneralException extends RuntimeException{
	
	private static final long serialVersionUID = 4182870901773713067L;
	
	private String userMessage;
	private String technicalMessage;
	private Exception rootException;
	
	public static GeneralException build(String technicalMessage) {
		return new GeneralException(null, technicalMessage,null);
	}
	
	public static GeneralException build(String technicalMessage, Exception rootException) {
		return new GeneralException(null, technicalMessage, rootException);
	}
	
	protected GeneralException(String userMessage, String technicalMessage, Exception rootExcepetion) {
		super();
		setUserMessage(userMessage);
		setTechnicalMessage(technicalMessage);

		setRootException(rootException);
	}

	private static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String getUserMessage() {
		return userMessage;
	}

	private String getTechnicalMessage() {
		return technicalMessage;
	}

	private Exception getRootException() {
		return rootException;
	}

	private void setUserMessage(String userMessage) {
		this.userMessage = trim(userMessage);
	}

	private void setTechnicalMessage(String technicalMessage) {
		this.technicalMessage = trim(technicalMessage);
	}

	private void setRootException(Exception rootException) {
		this.rootException = getUtilObject().getDefault(rootException, new Exception());
	}
	
	

}
