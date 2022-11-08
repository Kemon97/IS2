package com.mipresupuesto.personalbudget.application.service.dtoassembler.implementation;

import com.mipresupuesto.personalbudget.application.service.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.builder.BudgetDomainBuilder;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

public class BudgetDTOAssembler implements DTOAssembler<BudgetDTO, BudgetDomain>{

	@Override
	public BudgetDomain assembleDomain(BudgetDTO dto) {
		BudgetDomain domain = BudgetDomainBuilder.get().build();
		
		if (dto != null) {
			domain = BudgetDomainBuilder.get()

					.build();
		}
		return domain;
	}

	@Override
	public BudgetDTO assembleDTO(BudgetDomain domain) {
		BudgetDTO dto = new BudgetDTO();
		
		if (domain != null) {
			dto = 
			new BudgetDTO(

					);
				
		} 

		return dto;
	}

}
