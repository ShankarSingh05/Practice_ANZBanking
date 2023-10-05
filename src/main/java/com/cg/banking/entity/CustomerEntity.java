package com.cg.banking.entity;

import java.util.List;

import com.cg.banking.model.dto.Account;

//import com.cg.BankApplication.entity.Account;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "banking_core_customer")
public class CustomerEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "user",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<AccountEntity>account;
	
	private String address;
	
	private Long phoneno;
	
	private String email;
	
	 private List<Account> Accounts;

	public CustomerEntity() {
		
	}

	public CustomerEntity(Long id, String name, List<AccountEntity> account, String address, Long phoneno, String email,
			List<Account> accounts) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
		this.address = address;
		this.phoneno = phoneno;
		this.email = email;
		Accounts = accounts;
	}

	public void setAccounts(Object convertToEntityList) {
		// TODO Auto-generated method stub
		
	}	 
	
	}
