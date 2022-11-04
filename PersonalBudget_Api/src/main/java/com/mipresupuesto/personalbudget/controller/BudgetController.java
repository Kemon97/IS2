package com.mipresupuesto.personalbudget.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mipresupuesto.personalbudget.aplication.command.interfaces.CreateBudgetPort;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;
import com.mipresupuesto.personalbudget.entities.BudgetEntity;
import com.mipresupuesto.personalbudget.infrastructure.repository.sql.BudgetRepository;

@RestController
@RequestMapping("api/v1/budget")
public class BudgetController {
	
	@Autowired
	private CreateBudgetPort createBudgetPort;
	
	@PostMapping
	public BudgetDTO createBudget(@RequestBody BudgetDTO budget) {
		createBudgetPort.excute(budget);
		return budget;
	}
	
	@GetMapping
	public String saludar() {
		return "Hola mundo";
	}
	
	@Autowired
	private BudgetRepository budgetRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getReservation(@RequestParam(value="State", required=false) String State, Model model)
	{
		List<BudgetEntity> budgetList = new ArrayList<BudgetEntity>();
	}

}