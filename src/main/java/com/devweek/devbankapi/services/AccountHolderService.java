package com.devweek.devbankapi.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devweek.devbankapi.dtos.AccountHolderDTO;
import com.devweek.devbankapi.model.Account;
import com.devweek.devbankapi.model.AccountHolder;
import com.devweek.devbankapi.repositories.AccountHolderRepository;

@Service
public class AccountHolderService {
	
	@Autowired
	public AccountHolderRepository accountRepository;
	

	public void save(AccountHolderDTO accountDTO) {
		AccountHolder accountHolder = new AccountHolder();
		
		accountHolder.setCpf(accountDTO.getCpf());
		accountHolder.setName(accountDTO.getName());
		
		
		Account account = new Account();
		account.setBalance(0.0);
		account.setNumber(new Date().getTime());
		
		
		accountHolder.setAccount(account);
		
		accountRepository.save(accountHolder);
		
	}
}
