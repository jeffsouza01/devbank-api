package com.devweek.devbankapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devweek.devbankapi.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
