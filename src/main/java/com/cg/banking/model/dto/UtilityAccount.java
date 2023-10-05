package com.cg.banking.model.dto;

import lombok.Data;

@Data
public class UtilityAccount {
    private Long id;
    private String number;
    private String providerName;
	public UtilityAccount(Long id, String number, String providerName) {
		super();
		this.id = id;
		this.number = number;
		this.providerName = providerName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	@Override
	public String toString() {
		return "UtilityAccount [id=" + id + ", number=" + number + ", providerName=" + providerName + "]";
	}
    
    
}