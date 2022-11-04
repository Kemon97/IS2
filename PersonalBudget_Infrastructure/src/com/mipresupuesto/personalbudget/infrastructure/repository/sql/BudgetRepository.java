package com.mipresupuesto.personalbudget.infrastructure.repository.sql;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.mipresupuesto.personalbudget.entities.BudgetEntity;

public interface BudgetRepository<BudgetDomain> extends PagingAndSortingRepository<BudgetEntity, BudgetDomain> {

}
