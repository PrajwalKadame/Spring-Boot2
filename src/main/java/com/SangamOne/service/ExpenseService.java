package com.SangamOne.service;

import java.util.List;

import com.SangamOne.entity.Expense;



public interface ExpenseService {
	List<Expense> findAll();
	
	void save(Expense expense);
}
