package com.devweek.devbankapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devweek.devbankapi.model.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Long>{

}
