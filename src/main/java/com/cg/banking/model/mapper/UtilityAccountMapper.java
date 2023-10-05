package com.cg.banking.model.mapper;

import java.util.Collection;

import org.springframework.beans.BeanUtils;

import com.cg.banking.entity.AccountEntity;
import com.cg.banking.model.dto.Account;
import com.cg.banking.model.dto.UtilityAccount;

public  class UtilityAccountMapper extends BaseMapper<AccountEntity, UtilityAccount> {
    @Override
    public AccountEntity convertToEntity(UtilityAccount dto, Object... args) {
        AccountEntity entity = new AccountEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }

    public Account convertToDto(AccountEntity entity, Object... args) {
        Account dto = new Account();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto);
            return dto;
        
    }
		return dto;
    }

	@Override
	public UtilityAccount convertToDto(Collection<AccountEntity> entity, Object... args) {
		
		return null;
	}
}
    

/*
 * @Override public UtilityAccountEntity convertToEntity(UtilityAccount dto,
 * Object... args) { // TODO Auto-generated method stub return null; }
 * 
 * @Override public UtilityAccount convertToDto(Collection<UtilityAccountEntity>
 * entity, Object... args) { // TODO Auto-generated method stub return null; }
 * 
 * @Override public UtilityAccountEntity convertToEntity(UtilityAccount dto,
 * Object... args) { // TODO Auto-generated method stub return null; }
 * 
 * @Override public UtilityAccount convertToDto(Collection<UtilityAccountEntity>
 * entity, Object... args) { // TODO Auto-generated method stub return null; }
 */