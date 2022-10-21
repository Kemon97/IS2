package com.mipresupuesto.personalbudget.aplication.command.interfaces;

import com.mipresupuesto.personalbudget.dto.BudgetDTO;

public interface CreateBudgetPort {
	
	void excute(BudgetDTO budget);

}
