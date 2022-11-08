package com.mipresupuesto.personalbudget.application.service.specification;

import java.time.Year;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.service.specification.implementation.CompositeSpecification;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.infrastructure.repository.interfaces.BudgetRepository;

@Service
public class BudgetIsForNextYearSpecification extends CompositeSpecification<BudgetDomain>{
	

	@Autowired
	private BudgetRepository budgetRepository;
	

	@Override
	public boolean isSatisfiedBy(BudgetDomain budget) {

		if(budget.getYear().getYear() > Year.now().getValue()) {
			return true;
		}

		return false;
	}

}
