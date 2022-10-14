package com.mipresupuesto.personalbudget.dto;

public final class YearDTO {
	private String id;
	private int year;
	
	public YearDTO() {
		
	}
	
	public YearDTO(String id, int year) {
		setId(id);
		setYear(year);
	}
	
	public static final YearDTO create() {
		return new YearDTO();
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



