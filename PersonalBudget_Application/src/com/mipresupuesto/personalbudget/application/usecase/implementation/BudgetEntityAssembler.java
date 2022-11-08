package com.mipresupuesto.personalbudget.application.usecase.implementation;

import com.mipresupuesto.personalbudget.application.usecase.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.builder.BudgetDomainBuilder;
import com.mipresupuesto.personalbudget.entities.BudgetEntity;

public class BudgetEntityAssembler implements EntityAssembler<BudgetEntity, BudgetDomain> {

	@Override
	public BudgetDomain assembleDomain(BudgetEntity entity) {
		BudgetDomain domain = BudgetDomainBuilder.get().build();
		
		if(entity != null) {
			domain = BudgetDomainBuilder.get()
					.setId(entity.getId())
					
					.build();
		}
		
	
		return domain;
	}

	@Override
	public BudgetEntity assembleEntity(BudgetDomain domain) {
		BudgetEntity entity = new BudgetEntity();
			
			if(domain != null) {
				entity = new BudgetEntity();
						
			}
			return entity;
	}

}
