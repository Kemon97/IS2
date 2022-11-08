package com.mipresupuesto.personalbudget.application.service.specification;

public interface Specification<T> {
	
	boolean isSatisfiedBy(T repository);

}
