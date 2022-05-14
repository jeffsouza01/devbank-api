package com.devweek.devbankapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devweek.devbankapi.dtos.AccountHolderDTO;
import com.devweek.devbankapi.model.AccountHolder;
import com.devweek.devbankapi.repositories.AccountHolderRepository;
import com.devweek.devbankapi.services.AccountHolderService;

@RestController
@RequestMapping("/accounts")
public class AccountHolderController {
	
	@Autowired
	public AccountHolderRepository repository;
	
	@Autowired
	public AccountHolderService service;

	
	@GetMapping
	public List<AccountHolder> listAllUsersAccounts() {
		
		return repository.findAll();
	}
	
	
	@PostMapping
	public void save(@RequestBody AccountHolderDTO accountHolder) {
		service.save(accountHolder);
	}
	
	
}
