package com.mipresupuesto.personalbudget.entities;


public class BudgetEntity {
	
	private YearEntity year;
	private PersonEntity person;
	
	
	public YearEntity getYear() {
		return year;
	}
	public void setYear(YearEntity year) {
		this.year = year;
	}
	public PersonEntity getPerson() {
		return person;
	}
	public void setPerson(PersonEntity person) {
		this.person = person;
	}

}
