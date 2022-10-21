package com.mipresupuesto.personalbudget.application.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import com.mipresupuesto.personalbudget.application.service.dtoassembler.implementation.YearDTOAssembler;
import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.application.usecase.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.entities.BudgetEntity;
import com.mipresupuesto.personalbudget.infrastructure.repository.interfaces.BudgetRepository;

public class CreateBudgetUseCaseImpl implements CreateBudgetUseCase {
	
	@Autowired
	private EntityAssembler<BudgetEntity, BudgetDomain> entityAssembler;
	
	@Autowired
	private BudgetRepository budgetRepository;
	
	
	@Override
	public void execute(BudgetDomain budget) {
		budgetRepository.save(entityAssembler.assembleEntity(budget));
		
	}
	
	

}
