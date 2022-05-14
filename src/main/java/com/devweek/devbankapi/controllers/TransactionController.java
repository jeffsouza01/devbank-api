package com.devweek.devbankapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devweek.devbankapi.dtos.TransactionDTO;
import com.devweek.devbankapi.model.Transaction;
import com.devweek.devbankapi.repositories.TransactionRepository;
import com.devweek.devbankapi.services.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	@Autowired
	TransactionRepository transactionRepository;
	
	@Autowired
	TransactionService service;
	
	@GetMapping
	public List<Transaction> listAll() {
		return transactionRepository.findAll();
	}
	
	
	@PostMapping
	public void saveTransaction(@RequestBody TransactionDTO transactionDTO) {
		service.save(transactionDTO);
	}
	

}
