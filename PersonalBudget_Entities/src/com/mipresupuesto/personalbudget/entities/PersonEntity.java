package com.mipresupuesto.personalbudget.entities;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.UtilUUID;

public class PersonEntity {
	
	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;
	private String name;
	private String lastName;
	private String completeName;
	
	
	
	public PersonEntity() {
		setId(UtilUUID.DEFAULT_UUID);
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
	}
	
	public PersonEntity(final UUID id, final String idCard, final String firstName, final String middleName,
			final String firstSurname, final String secondSurname, final String name, final String lastName, final String completeName) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setFirstSurname(firstSurname);
		setSecondSurname(secondSurname);
		setName(name);
		setLastName(lastName);
		setCompleteName(completeName);
	}
	public final UUID getId() {
		if(id==null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		return id;
	}
	public final String getIdCard() {
		return idCard;
	}
	public final String getFirstName() {
		return firstName;
	}
	public final String getMiddleName() {
		return middleName;
	}
	public final String getFirstSurname() {
		return firstSurname;
	}
	public final String getSecondSurname() {
		return secondSurname;
	}
	public final void setId(final UUID id) {
		this.id = id;
	}
	public final void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public final void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}
	public final void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	public final String getName() {
		if(name==null) {
			setName("");
		}
		return name.trim();
	}
	public final String getLastName() {
		return lastName;
	}
	public final String getCompleteName() {
		return completeName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

}
