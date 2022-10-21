package com.mipresupuesto.personalbudget.application.usecase.entityassembler;

public interface EntityAssembler<T, D> {
	
	D assembleDomain(T entity);
	
	T assembleEntity(D domain);

}
