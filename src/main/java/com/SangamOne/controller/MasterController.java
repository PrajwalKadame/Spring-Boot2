package com.SangamOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SangamOne.entity.Expense;
import com.SangamOne.service.ExpenseService;



@Controller
public class MasterController {

	
	
	@Autowired
	ExpenseService expensesService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "List of expenses");
		List<Expense> expenses = expensesService.findAll();
		mav.addObject("expenses", expenses);
		return mav;
	}
	
	@RequestMapping("/expense")
	public ModelAndView addExpense() {
		ModelAndView mav = new ModelAndView("expense");
		mav.addObject("expense", new Expense());
		return mav;
	}
}
