package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.domain.PersonDomain;

public class PersonDomainBuilder {
	
	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSureName;
	private String secondSureName;
	
	private PersonDomainBuilder() {
		setId(UUID.randomUUID());
		setIdCard("");
		setFirstName("");
		setMiddleName("");
	}
	public static final PersonDomainBuilder get() {
		return new PersonDomainBuilder();
	}
	public PersonDomainBuilder setId(final UUID id) {
		this.id=(id==null) ? UUID.randomUUID(): id;
		return this;
	}
	public PersonDomainBuilder setIdCard(String idCard) {
		return this;
	}
	public PersonDomainBuilder setFirstName(String firstName) {
		return this;
	}
	public PersonDomainBuilder setMiddleName(String middleName) {
		return this;
	}
	
	private String getFirstSureName() {
		return firstSureName;
	}
	private String getSecondSureName() {
		return secondSureName;
	}
	public void setFirstSureName(String firstSureName) {
		this.firstSureName = firstSureName;
	}
	public void setSecondSureName(String secondSureName) {
		this.secondSureName = secondSureName;
	}
	private UUID getId() {
		return id;
	}
	private String getIdCard() {
		return idCard;
	}
	private String getFirstName() {
		return firstName;
	}
	private String getMiddleName() {
		return middleName;
	}
	
	public PersonDomain build() {
		return PersonDomain.create(id, idCard, firstName, middleName, firstSureName, secondSureName);
	}

	

}
