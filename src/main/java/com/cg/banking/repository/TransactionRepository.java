package com.cg.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.banking.entity.Transaction.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {}