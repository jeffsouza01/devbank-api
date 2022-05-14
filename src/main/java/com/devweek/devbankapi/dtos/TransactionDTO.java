package com.devweek.devbankapi.dtos;

import com.devweek.devbankapi.model.TransactionType;

public class TransactionDTO {
	private String description;
	private Double value;
	private TransactionType type;
	
	private Long idAccount;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public Long getIdAccount() {
		return idAccount;
	}

	public void setIdConta(Long idAccount) {
		this.idAccount = idAccount;
	}
	
	
	

}
