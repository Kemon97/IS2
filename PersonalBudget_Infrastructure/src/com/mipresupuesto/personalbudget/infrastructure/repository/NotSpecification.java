package com.mipresupuesto.personalbudget.infrastructure.repository;

public class NotSpecification<T> extends CompositeSpecification<T> {
	
	private final Specification<T> specification;

    public NotSpecification(Specification<T> pSpecification) {
        this.specification = pSpecification;
    }

    @Override
    public boolean isSatisfiedBy(T t) {
        return !specification.isSatisfiedBy(t);
    }

}
