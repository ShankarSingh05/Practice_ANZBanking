package com.cg.banking.model.mapper;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.cg.banking.entity.AccountEntity;
import com.cg.banking.model.dto.Account;

public class BankAccountMapper extends BaseMapper<AccountEntity, Account> {

	@Override
    public AccountEntity convertToEntity(Account dto, Object... args) {
        AccountEntity entity = new AccountEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity, "user");
        }
        return entity;
    }
	/*
	 * @Override public Account convertToDto(AccountEntity entity, Object... args) {
	 * Account dto = new Account(); if (entity != null) {
	 * BeanUtils.copyProperties(entity, dto, "user"); } return dto; }
	 * 
	 * @Override public AccountEntity convertToEntity1(Account dto, Object... args)
	 * { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public Account convertToDto(Collection<AccountEntity> entity,
	 * Object... args) { // TODO Auto-generated method stub return null; }
	 */

	@Override
	public Account convertToDto(Collection<AccountEntity> entity, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object convertToEntityList(List<Account> accounts) {
		// TODO Auto-generated method stub
		return null;
	}
	}