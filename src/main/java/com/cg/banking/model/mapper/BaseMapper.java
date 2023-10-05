package com.cg.banking.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.cg.banking.entity.AccountEntity;
import com.cg.banking.entity.CustomerEntity;
import com.cg.banking.model.dto.Account;
import com.cg.banking.model.dto.Customer;

public abstract class BaseMapper<E, D> {
    public abstract E convertToEntity(D dto, Object... args);

    public abstract D convertToDto(Collection<E> entity, Object... args);

    public Collection<E> convertToEntity(Collection<D> dto, Object... args) {
        return dto.stream().map(d -> convertToEntity(d, args)).collect(Collectors.toList());
    }
    public List<D> convertToDtoList(Collection<E> entity, Object... args) {
        return ((Collection<D>) convertToDto(entity, args)).stream().collect(Collectors.toList());
    }

    public Set<E> convertToEntitySet(Collection<D> dto, Object... args) {
        return convertToEntity(dto, args).stream().collect(Collectors.toSet());
    }

    public Set<D> convertToDtoSet(Collection<E> entity, Object... args) {
        return ((Collection<D>) convertToDto(entity, args)).stream().collect(Collectors.toSet());
    }

	public Customer convertToDto(CustomerEntity entity, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

	public Account convertToDto(AccountEntity entity, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}
	
}