package com.mipresupuesto.personalbudget.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mipresupuesto.personalbudget.application.command.interfaces.CreateBudgetPort;
import com.mipresupuesto.personalbudget.controller.response.Response;
import com.mipresupuesto.personalbudget.controller.response.dto.Message;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;
import com.mipresupuesto.personalbudget.entities.BudgetEntity;
import com.mipresupuesto.personalbudget.infrastructure.repository.interfaces.BudgetRepository;


@RestController
@RequestMapping("api/v1/budget")
public class BudgetController {

	@Autowired
	private CreateBudgetPort createBudgetPort;
	
	@PostMapping
	public ResponseEntity<Response<BudgetDTO>> create(@RequestBody BudgetDTO budget) {
		
		ResponseEntity<Response<BudgetDTO>> responseEntity;
		Response<BudgetDTO> response = new Response<>();
		HttpStatus statusCode = HttpStatus.OK;
		
				
		try {
			createBudgetPort.execute(budget);
			
			response.addMessage(Message.createSuccessMessage("El budget se ha creado de forma satisfactoria"));
		} catch (final Exception excepcion) {
			statusCode = HttpStatus.BAD_REQUEST;
			//si excepcion tiene mensaje de usuario, agrego el mensaje de usuario, sino, agrego un mensaje generico
			response.addMessage(Message.createErrorMessage("Ha ocurrido un problema inesperado tratando de crear el presupuesto deseado..."));
		}
		
		createBudgetPort.execute(budget);
		return new ResponseEntity<>(response,statusCode);
		
	}
	
	@GetMapping("/saludo")
	public ResponseEntity<Response<BudgetDTO>> saludar(@RequestBody BudgetDTO budget) {
		
		ResponseEntity<Response<BudgetDTO>> responseEntity;
		Response<BudgetDTO> response = new Response<>();
		HttpStatus statusCode = HttpStatus.OK;
		
				
		try {
			createBudgetPort.execute(budget);
			
			response.addMessage(Message.createSuccessMessage("El budget se ha creado de forma satisfactoria"));
		} catch (final Exception excepcion) {
			statusCode = HttpStatus.BAD_REQUEST;
			//si excepcion tiene mensaje de usuario, agrego el mensaje de usuario, sino, agrego un mensaje generico
			response.addMessage(Message.createErrorMessage("Ha ocurrido un problema inesperado tratando de crear el presupuesto deseado..."));
		}
		
		createBudgetPort.execute(budget);
		return new ResponseEntity<>(response,statusCode);

	}
	
	@Autowired
	private BudgetRepository budgetRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getReservation(@RequestParam(value = "state", required=false) String state, Model model)
	{
		List<BudgetEntity> budgetList = new ArrayList<>();
		
		Iterable<BudgetEntity> budgets = this.budgetRepository.findAll();
		budgets.forEach(budget -> {
			budgetList.add(budget);
		});
		
		model.addAttribute("budgets", budgetList);
		return "budgets";
	}

}