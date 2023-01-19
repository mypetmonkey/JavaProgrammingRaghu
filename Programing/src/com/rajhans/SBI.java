package com.rajhans;

import java.util.ArrayList;

public class SBI {
	long acno;
	String acholder;
	long contact;
	public SBI(long acno, String acholder, long contact) {
		this.acno = acno;
		this.acholder = acholder;
		this.contact = contact;
	}
	public static void main(String[] args) {
		
	}
	public String toString() {
		return "SBI [acno=" + acno + ", acholder=" + acholder + ", contact=" + contact + "]";
	}
	}
class ICICI{
	long acno;
	long contact;
	double balance;
	public ICICI(long acno, long contact, double balance) {
		this.acno = acno;
		this.contact = contact;
		this.balance = balance;
	}
	public static void main(String[] args) {
		
	}
	public String toString() {
		return "ICICI [acno=" + acno + ", contact=" + contact + ", balance=" + balance + "]";
	}
	
}
class ListEx1{
	public static void main(String[] args) {
		ArrayList<Object> ob1=new ArrayList<Object>();
		ob1.add(new SBI(123456789123l,"Rajhans",9876543212l));
		ob1.add(new ICICI(23454322345l,9878987898l,600000.99));
		//System.out.println(ob1);
		for(Object i:ob1) {
			System.out.println(i);
		}
	}
}