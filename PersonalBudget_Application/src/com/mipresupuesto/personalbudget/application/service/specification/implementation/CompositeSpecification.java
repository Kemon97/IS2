package com.mipresupuesto.personalbudget.application.service.specification.implementation;

import com.mipresupuesto.personalbudget.application.service.specification.Specification;

public abstract class CompositeSpecification<T> implements Specification<T> {
	
    public CompositeSpecification<T> or(Specification<T> specification) {
        return new OrSpecification<>(this, specification);
    }

    public CompositeSpecification<T> and(Specification<T> specification) {
        return new AndSpecification<>(this, specification);
    }

    public CompositeSpecification<T> not() {
    	return new NotSpecification<T>(this);
    }

}
