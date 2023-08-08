package com.SangamOne.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SangamOne.Repository.ExpenseRepository;
import com.SangamOne.entity.Expense;

@Service
public class ExpenseServiceImpl implements ExpenseService{
	
	@Autowired
	ExpenseRepository expenseRepo;

	@Override
	public List<Expense> findAll() {
		return expenseRepo.findAll();
	}

	@Override
	public void save(Expense expense) {
		expense.setCreatedAt(System.currentTimeMillis());
		expenseRepo.save(expense);
	}

	@Override
	public Expense findById(Long id) {
		if(expenseRepo.findById(id).isPresent()){
		return expenseRepo.findById(id).get();
	}
		return null;
	}
}
