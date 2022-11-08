package com.mipresupuesto.personalbudget.application.service.specification;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.service.specification.implementation.CompositeSpecification;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.entities.PersonEntity;
import com.mipresupuesto.personalbudget.infrastructure.repository.interfaces.PersonRepository;

@Service
public class IsExistPersonSpecification extends CompositeSpecification<PersonDomain>{

	@Autowired
	private  PersonRepository personRepository;
	
	
	@Override
	public boolean isSatisfiedBy(PersonDomain person) {
		//consultar en base de datos
		Optional<PersonEntity> existPerson = personRepository.findById(person.getId());

		if(existPerson.isPresent()) {
			return true;
			
		}
//		throw GeneralException.build()
		return false;
	}

}
