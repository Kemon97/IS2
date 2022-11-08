package com.mipresupuesto.personalbudget.application.service.specification;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.service.specification.implementation.CompositeSpecification;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.entities.BudgetEntity;
import com.mipresupuesto.personalbudget.infrastructure.repository.interfaces.BudgetRepository;

@Service
public class isExistBudgetEqualYearPersonSpecification extends CompositeSpecification<BudgetDomain>{

	@Autowired
	private BudgetRepository budgetRepository;
	
	@Override
	public boolean isSatisfiedBy(BudgetDomain budget) {
		
		Optional<BudgetEntity> existBudget = budgetRepository
				.findByPersonAndYear(budget.getPerson().getId(),budget.getYear().getId());
				
		if(existBudget.isPresent()) {
			return true;
		}
//		throw GeneralException.build()
		return false;

	}

}
