package com.techno.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Boy {
	@Id
	private int id;
	private String name;
	private double balance;
	
	@OneToOne
	private Girl girl;
	
	
	public Girl getGirl() {
		return girl;
	}
	public void setGirl(Girl girl) {
		this.girl = girl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Boy [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	

}
