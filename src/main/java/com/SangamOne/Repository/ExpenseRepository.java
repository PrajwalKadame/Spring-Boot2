package com.SangamOne.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SangamOne.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer>{

	Optional<Expense> findById(Long id);


}
