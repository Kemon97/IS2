package com.mipresupuesto.personalbudget.infrastructure.repository;

import org.hibernate.sql.ordering.antlr.OrderingSpecification;

public interface Specification<T> {
	
	boolean isSatisfied(T repository);
	
	default Specification<T> and(Specification<T>... specifications){
		return new AndSpecification(specifications);
	}
	
	default Specification<T> or(Specification<T>...specifications){
		return new OrSpecification(specifications);
	}
	
	default Specification<T> not(Specification<T>...specifications){
		return new NotSpecification(specifications);
	}

}
