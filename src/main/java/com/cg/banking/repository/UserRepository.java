package com.cg.banking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.banking.entity.CustomerEntity;

public interface UserRepository extends JpaRepository<CustomerEntity, Long> {
    Optional<CustomerEntity> findByIdentificationNumber(String identificationNumber);
}