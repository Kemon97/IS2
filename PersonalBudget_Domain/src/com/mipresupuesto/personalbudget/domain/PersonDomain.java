package com.mipresupuesto.personalbudget.domain;

public class PersonDomain {
	
	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSureName;
	private String secondSureName;
	
	private PersonDomain(final String id, final String idCard, final String firstName, final String middleName, final String firstSureName, final String secondSureName) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setFirstSureName(firstSureName);
		setSecondSureName(secondSureName);
	}
	public static PersonDomain create(final String id, final String idCard,final String firstName, final String middleName, final String firstSureName, final String secondSureName) {
		return new PersonDomain(id, idCard, firstName, middleName, firstSureName, secondSureName);
		
	}
	private void setId(String id) {
		this.id = id;
	}
	private void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	private void setFirstSureName(String firstSureName) {
		this.firstSureName = firstSureName;
	}
	private void setSecondSureName(String secondSureName) {
		this.secondSureName = secondSureName;
	}
	public final String getId() {
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
	public final String getFirstSureName() {
		return firstSureName;
	}
	
	public final String getSecondSureName() {
		return secondSureName;
	}
	 public final String getLastName() {
		 return getFirstSureName()+ " " + getSecondSureName();
	 }
	 public final String getName() {
		 return (getFirstName()+ " " + getMiddleName()).trim()+ " " + getLastName();
	 }
	
}
