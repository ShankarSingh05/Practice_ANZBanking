package com.cg.banking.model.dto;

import java.util.List;

import lombok.Data;

@Data
public class Customer {

    private Long id;
    private String name;
    //private String lastName;
    private String email;
    //private String identificationNumber;
    private String address;
    private Long phoneno;
    private List<Account> Accounts;
	public Customer(Long id, String name, String email, String address, Long phoneno, List<Account> accounts) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneno = phoneno;
		Accounts = accounts;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public List<Account> getAccounts() {
		return Accounts;
	}
	public void setAccounts(List<Account> accounts) {
		Accounts = accounts;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phoneno="
				+ phoneno + ", Accounts=" + Accounts + "]";
	}
    
	
    
}