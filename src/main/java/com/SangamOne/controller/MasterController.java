package com.SangamOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		List<Expense> expense = expensesService.findAll();
		mav.addObject("expenses", expense);
		return mav;
	}
	
	@RequestMapping("/expense")
	public ModelAndView addExpense() {
		ModelAndView mav = new ModelAndView("expense");
		mav.addObject("expense", new Expense());
		return mav;
	}
	
	@RequestMapping(value="/expense", method=RequestMethod.POST)
	public String save(@ModelAttribute("expense") Expense expense) {
		expensesService.save(expense);
		return "redirect:/";
	}
	
	@RequestMapping(value="/expense/{id}", method=RequestMethod.POST)
	public ModelAndView edit(@PathVariable("id") Long id) {
		ModelAndView mav = new ModelAndView("expense");
		Expense expense = expensesService.findById(id);
		mav.addObject("expenses", expense);
		return mav;
	}
	
	
}
