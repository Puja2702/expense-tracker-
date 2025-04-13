package com.service.tracker.service;

import com.service.tracker.models.Expense;
import com.service.tracker.repository.ExpenseRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Resource
    private ExpenseRepository expenseRepository;

    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses(Long user) {
        return expenseRepository.findByUser(user);
    }

    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).orElseThrow();
    }

    public Expense updateExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}