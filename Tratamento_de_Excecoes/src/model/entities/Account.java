package model.entities;

import model.exceptions.AccountException;

//import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance = 0.0;
	private Double withdrawLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double withdrawLimit) {
		this.number = number;
//		this.balance = balance;
		this.holder = holder;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
//	public void withdraw(double amount) {
//		if(amount <= withdrawLimit && balance > 0 && amount <= balance) {
//			this.balance -= amount;
//		}
//		if(amount > withdrawLimit || amount > balance) {
//			if(amount > balance) {
//				throw new IllegalArgumentException("Erro -> o valor do saque é maior que o disponível em conta.");
//			}
//			else{
//				throw new IllegalArgumentException("Erro -> o valor do saque é maior que o limite estabelecido.");
//			}
//		}
//	}
	public void withdraw(double amount) {
		if(amount <= withdrawLimit && balance > 0 && amount <= balance) {
			this.balance -= amount;
		}
		if(amount > withdrawLimit || amount > balance) {
			if(amount > balance) {
				throw new AccountException("Erro -> o valor do saque é maior que o disponível em conta.");
			}
			else{
				throw new AccountException("Erro -> o valor do saque é maior que o limite estabelecido.");
			}
		}
	}
}
