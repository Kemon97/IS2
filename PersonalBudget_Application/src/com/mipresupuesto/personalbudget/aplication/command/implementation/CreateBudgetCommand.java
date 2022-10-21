package com.mipresupuesto.personalbudget.aplication.command.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import com.mipresupuesto.personalbudget.aplication.command.interfaces.CreateBudgetPort;
import com.mipresupuesto.personalbudget.application.service.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

public class CreateBudgetCommand implements CreateBudgetPort{
	
	@Autowired
	private DTOAssembler<BudgetDTO, BudgetDomain> dtoAssembler;
	
	@Autowired
	private CreateBudgetUseCase useCase;
	
	@Override
	public void excute(BudgetDTO budget) {
		useCase.execute(dtoAssembler.assembleDomain(budget));
		
	}

}
