package com.cg.banking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.banking.entity.AccountEntity;

public interface UtilityAccountRepository extends JpaRepository<AccountEntity, Long> {
    Optional<AccountEntity> findByProviderName(String provider);
}