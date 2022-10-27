package com.mipresupuesto.personalbudget.crosscutting;

import java.sql.Connection;
import java.sql.SQLException;

import com.mipresupuesto.personalbudget.crosscutting.exception.GeneralException;

public class UtilSql {
	
	private UtilSql() {
	}
	
	public static boolean isClosed(Connection sql) {
		
		if(UtilObject.getUtilObject().isNull(sql)) {
			throw GeneralException.build("Sql is null");
		}
		try {
			return sql.isClosed();
		} catch (SQLException exception) {
			throw GeneralException.build("Problems trying to validate if connection was closed", exception);
			
		}
	}
	
	public static boolean isOpen(Connection connection) {
		return !isClosed(connection);
	}

}
