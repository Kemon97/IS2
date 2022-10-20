package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.UtilUUID;

public final class YearDomain {
	
	private UUID id;
	private int year;
	
	private YearDomain(UUID id, int year) {
		setId(id);
		setYear(year);
	}
	public static YearDomain create(UUID id, int year){
		return new YearDomain(id, year);
	}
	
	private final void setId(UUID id) {
		this.id=(id==null) ? UtilUUID.DEFAULT_UUID : id;
	}

	private final void setYear(int year) {
		this.year = year;
	}
	public final UUID getId() {
		return id;
	}

	public int getYear() {
		return year;
	}
	
	

}
