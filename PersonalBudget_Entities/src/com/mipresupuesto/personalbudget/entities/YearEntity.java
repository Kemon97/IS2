package com.mipresupuesto.personalbudget.entities;


public class YearEntity {
	private String id;
	private int year;
	
	public YearEntity() {
		setId("");
		setYear(0);
	}
	
	public YearEntity(String id, int year) {
		setId(id);
		setYear(year);
	}

	private final void setId(String id) {
		this.id = id;
	}

	private final void setYear(int year) {
		this.year = year;
	}

	public final String getId() {
		if (id== null) {
			setId("");
		}
		return id.trim();
	}

	public final int getYear() {
		return year;
	}

}
