package com.devweek.devbankapi.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devweek.devbankapi.dtos.TransactionDTO;
import com.devweek.devbankapi.model.Transaction;
import com.devweek.devbankapi.model.TransactionType;
import com.devweek.devbankapi.repositories.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository repository;
	
	public void save(TransactionDTO transactionDTO) {
		Transaction transaction = new Transaction();
		
		// Double value = transactionDTO.getType() == TransactionType.INCOME ? transactionDTO.get
	
		Double value = transactionDTO.getValue();
		if (transactionDTO.getType() == TransactionType.OUTCOME )
			value *= -1;
	
	
		transaction.setDateTime(LocalDateTime.now());
		transaction.setDescription(transactionDTO.getDescription());
		transaction.setIdAccount(transactionDTO.getIdAccount());
		transaction.setType(transactionDTO.getType());
		transaction.setValue(value);
		
		repository.save(transaction);
	}
	
	
}
