package com.cg.banking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.banking.entity.AccountEntity;

public interface BankAccountRepository extends JpaRepository<AccountEntity, Long> {
    Optional<AccountEntity> findByNumber(String accountNumber);
}
