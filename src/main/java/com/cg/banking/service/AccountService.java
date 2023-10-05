package com.cg.banking.service;

import org.springframework.stereotype.Service;

import com.cg.banking.entity.AccountEntity;
import com.cg.banking.model.dto.Account;
import com.cg.banking.model.dto.UtilityAccount;
import com.cg.banking.model.mapper.BankAccountMapper;
import com.cg.banking.model.mapper.UtilityAccountMapper;
import com.cg.banking.repository.BankAccountRepository;
import com.cg.banking.repository.UtilityAccountRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

	private BankAccountMapper bankAccountMapper = new BankAccountMapper();
	private UtilityAccountMapper utilityAccountMapper = new UtilityAccountMapper();

	private final BankAccountRepository bankAccountRepository = null;
	private final UtilityAccountRepository utilityAccountRepository = null;

	public Account readAccount(String accountNumber) {
        AccountEntity entity = bankAccountRepository.findByNumber(accountNumber).get();
        return bankAccountMapper.convertToDto(entity);
    }
	public Account readUtilityAccount(String provider) {
        AccountEntity utilityAccountEntity = utilityAccountRepository.findByProviderName(provider).get();
        return utilityAccountMapper.convertToDto(utilityAccountEntity);
    }

    public Account readUtilityAccount(Long id){
        return utilityAccountMapper.convertToDto(utilityAccountRepository.findById(id).get());
    }

}