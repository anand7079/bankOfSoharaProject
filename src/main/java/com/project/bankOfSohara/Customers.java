package com.project.bankOfSohara;

import java.awt.Image;
import java.math.BigInteger;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
    @Id
	private BigInteger customer_id;
	private String name;
	private String panNumber;
	private BigInteger aadharNumber;
	private BigInteger accountNumber;
	private String address;
	private double balance;
	//private Blob photo;
	public Customers()
	{
		
	}
	
	
	public Customers(BigInteger customer_id, String name, String panNumber, BigInteger aadharNumber,
			BigInteger accountNumber, String address, double balance) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.panNumber = panNumber;
		this.aadharNumber = aadharNumber;
		this.accountNumber = accountNumber;
		this.address = address;
		this.balance = balance;
		//this.photo = photo;
	}


	public BigInteger getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(BigInteger customer_id) {
		this.customer_id = customer_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPanNumber() {
		return panNumber;
	}


	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}


	public BigInteger getAadharNumber() {
		return aadharNumber;
	}


	public void setAadharNumber(BigInteger aadharNumber) {
		this.aadharNumber = aadharNumber;
	}


	public BigInteger getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


//	public Blob getPhoto() {
//		return photo;
//	}
//
//
//	public void setPhoto(Blob photo) {
//		this.photo = photo;
//	}


	@Override
	public String toString() {
		return "Customers [customer_id=" + customer_id + ", name=" + name + ", panNumber=" + panNumber
				+ ", aadharNumber=" + aadharNumber + ", accountNumber=" + accountNumber + ", address=" + address
				+ ", balance=" + balance + "]";
	}
	
	
}
