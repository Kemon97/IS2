package com.mipresupuesto.personalbudget.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mipresupuesto.personalbudget.crosscutting.UtilUUID;


@Entity
@Table(name = "Budget")
public class BudgetEntity {
	
	@Id
	@Column(name = "id")
	private UUID id;
	@ManyToOne
	@JoinColumn(name = "idYear")
	private YearEntity year;
	@ManyToOne
	@JoinColumn(name = "idPerson")
	private PersonEntity person;
	
	public BudgetEntity() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(year);
		setPerson(person);
	}
	public final YearEntity getYear() {
		return year;
	}
	public final void setYear(YearEntity year) {
		this.year = year;
	}
	public final PersonEntity getPerson() {
		if(person==null) {
			setPerson(new PersonEntity());
		}
		return person;
	}
	public final void setPerson(PersonEntity person) {
		this.person = person;
	}
	public final UUID getId() {
		if(id==null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		return id;
	}
	public final void setId(UUID id) {
		this.id = id;
	}
	

}
