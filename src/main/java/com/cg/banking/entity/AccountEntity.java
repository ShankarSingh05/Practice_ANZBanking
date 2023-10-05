package com.cg.banking.entity;

import java.math.BigDecimal;

import com.cg.banking.model.AccountStatus;
import com.cg.banking.model.AccountType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "banking_core_account")
public class AccountEntity 
{
	private String accountNo;
	private String custName;
	private Double balance;
	private String accountType;
	//private List<Transaction>tarnsaction;
	//private Double tranAmount;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @Enumerated(EnumType.STRING)
    private AccountType type;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    private BigDecimal availableBalance;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;
    
    public AccountEntity() {		
	}

	public AccountEntity(String accountNo, String custName, Double balance, String accountType, Long id, String number,
			AccountType type, AccountStatus status, BigDecimal availableBalance, CustomerEntity customer) {
		super();
		this.accountNo = accountNo;
		this.custName = custName;
		this.balance = balance;
		this.accountType = accountType;
		this.id = id;
		this.number = number;
		this.type = type;
		this.status = status;
		this.availableBalance = availableBalance;
		this.customer = customer;
	}  

}
	
