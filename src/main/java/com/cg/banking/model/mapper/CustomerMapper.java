package com.cg.banking.model.mapper;

import java.util.Collection;

import org.springframework.beans.BeanUtils;

import com.cg.banking.entity.CustomerEntity;
import com.cg.banking.model.dto.Customer;

public class CustomerMapper extends BaseMapper<CustomerEntity, Customer> {
	private BankAccountMapper bankAccountMapper = new BankAccountMapper();

	@Override
	public CustomerEntity convertToEntity(Customer dto, Object... args) {
		CustomerEntity entity = new CustomerEntity();
		if (dto != null) {
			BeanUtils.copyProperties(dto, entity, "accounts");
			entity.setAccounts(bankAccountMapper.convertToEntityList(dto.getAccounts()));
		}
		return entity;
	}

	@Override
	public Customer convertToDto(CustomerEntity entity, Object... args) {
		Customer dto = new Customer();
		if (entity != null) {
			BeanUtils.copyProperties(entity, dto, "accounts");
			dto.setBankAccounts(bankAccountMapper.convertToDtoList(entity.getAccounts()));
		}
		return dto;
	}

	@Override
	public Customer convertToDto(Collection<CustomerEntity> entity, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}
}