package com.mipresupuesto.personalbudget.application.service.implementation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.usecase.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.application.service.specification.BudgetIsForNextYearSpecification;
import com.mipresupuesto.personalbudget.application.service.specification.isExistBudgetEqualYearPersonSpecification;
import com.mipresupuesto.personalbudget.application.service.specification.isExistPersonSpecification;
import com.mipresupuesto.personalbudget.application.service.specification.isExistYearSpecification;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.entities.BudgetEntity;
import com.mipresupuesto.personalbudget.infrastructure.repository.interfaces.BudgetRepository;

@Service
@Transactional
public  class CreateBudgetUseCaseImpl implements CreateBudgetUseCase{
	
	@Autowired
	private  EntityAssembler<BudgetEntity, BudgetDomain> entityAssembler;
	
	@Autowired
	private  BudgetRepository budgetRepository;
	
	@Autowired
	isExistPersonSpecification isExistPersonS;
	
	@Autowired
	isExistYearSpecification isExistYearS;
	
	@Autowired
	isExistBudgetEqualYearPersonSpecification existBudgetEqualYearPersonS;
	
	@Autowired
	BudgetIsForNextYearSpecification yearGreaterThanActualS;
	
	@Override
	public  void execute(BudgetDomain budget) {
		boolean existPerson = isExistPersonS.isSatisfiedBy(budget.getPerson());
		boolean existYear = isExistYearS.isSatisfiedBy(budget.getYear());
		
		boolean existBudgetEqualYearPerson = existBudgetEqualYearPersonS.isSatisfiedBy(budget);
		boolean yearGreaterThanActual = yearGreaterThanActualS.isSatisfiedBy(budget);

		
		if(existPerson && existYear && !existBudgetEqualYearPerson && yearGreaterThanActual ) {
			
			budgetRepository.save(entityAssembler.assembleEntity(budget));
		}
		
	}
	

}
