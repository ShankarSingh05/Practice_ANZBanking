package com.cg.banking.model.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Transaction {

    private Long id;
    private BigDecimal amount;
    private Account bankAccount;
    private String referenceNumber;
	public Transaction(Long id, BigDecimal amount, Account bankAccount, String referenceNumber) {
		super();
		this.id = id;
		this.amount = amount;
		this.bankAccount = bankAccount;
		this.referenceNumber = referenceNumber;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Account getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(Account bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", bankAccount=" + bankAccount + ", referenceNumber="
				+ referenceNumber + "]";
	}

}