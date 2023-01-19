package com.rajhans;

import java.util.Scanner;

public class SBIAccount {
	long acno;
	int pin;
	double balance;
	public SBIAccount(long acno, int pin, double balance) {
		this.acno = acno;
		this.pin = pin;
		this.balance = balance;
	}
	public static void main(String[] args) {
		SBIAccount a1=new SBIAccount(2123344323l,1234,60000d);
		a1.withdrawMoney();
		
	}
	public void withdrawMoney() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your pin");
		int p=sc.nextInt();
		try {
	if(p==pin) {
		System.out.println("enter the amount");
		double amt=sc.nextDouble();
		
		if (amt<=balance) {
			balance=balance-amt;
			System.out.println("collect your cash");
		}
		else
		{
			throw new InvalidException("wrong pin");
		} 
		
	}}
		catch (InvalidException e){
			System.out.println("insufficient balance");
		}
			}
		
		
		
	public void sample() {
		System.out.println("you can go");
	}
	

	}
class InvalidException extends RuntimeException{
	public InvalidException(String s) {
		super();	}
}
