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
		SBIAccount a1=new SBIAccount(123456789,1234,2000);
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
			System.out.println("remaining balance is :"+balance);
			System.out.println("collect your cash");
		}
	}
	
	else if(p!=pin)
		{
			throw new InvalidException("wrong pin");
		} 
		
		
		}catch(InvalidException e) {
			System.out.println("wrong pin");
		}
		
	}
}
	
@SuppressWarnings("serial")
class InvalidException extends RuntimeException{
	public InvalidException(String s) {
		super();	
	}
}

		
