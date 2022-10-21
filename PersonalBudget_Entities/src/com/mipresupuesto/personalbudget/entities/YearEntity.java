package com.mipresupuesto.personalbudget.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mipresupuesto.personalbudget.crosscutting.UtilUUID;

@Entity
@Table(name = "Year")
public class YearEntity {
	
	@Id
	@Column(name = "id")
	private UUID id;
	@Column(name = "year")
	private int year;
	
	public YearEntity() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(0);
	}
	
	public YearEntity(UUID id, int year) {
		setId(id);
		setYear(year);
	}

	private final void setId(final UUID id) {
		this.id = id;
	}

	private final void setYear(int year) {
		this.year = year;
	}

	public final UUID getId() {
		if(id==null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		return id;
	}

	public final int getYear() {
		return year;
	}

}
