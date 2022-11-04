package com.mipresupuesto.personalbudget.application.specification;

public class BudgetAndSpecification<T> extends CompositeSpecification<T> {
	
	private final Specification<T> left;
	private final Specification<T> right;
	
	public BudgetAndSpecification(Specification<T> pLeft, Specification<T> pRight) {
		this.left = pLeft;
		this.right = pRight;
	}
	
	public boolean isSatisfiedBy(T t) {
		return left.isSatisfiedBy(t) && right.isSatisfiedBy(t);
	}

}
