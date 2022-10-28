package com.mipresupuesto.personalbudget.infrastructure.repository;

public interface Specification<T> {
	
	boolean isSatisfiedBy(T repository);

}
