package com.mipresupuesto.personalbudget.application.service.specification;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.service.specification.implementation.CompositeSpecification;
import com.mipresupuesto.personalbudget.domain.YearDomain;
import com.mipresupuesto.personalbudget.entities.YearEntity;
import com.mipresupuesto.personalbudget.infrastructure.repository.interfaces.YearRepository;

@Service

public class IsExistYearSpecification extends CompositeSpecification<YearDomain>{
	
	@Autowired
	private YearRepository yearRepository;
	
	@Override
	public boolean isSatisfiedBy(YearDomain year) {
	
		Optional<YearEntity> existYear = yearRepository.findById(year.getId());
		
		if(existYear.isPresent()) {
			return true;
		}

		return false;
	
	}

}
