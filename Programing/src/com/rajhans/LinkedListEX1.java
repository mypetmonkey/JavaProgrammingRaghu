package com.rajhans;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEX1  implements Comparable <LinkedListEX1>{
	//Account
	double balance;
	long acno;
	String acholder;
	public LinkedListEX1(double balance, long acno, String acholder) {
		this.balance = balance;
		this.acno = acno;
		this.acholder = acholder;
	}
	public String toString() {
		return "LinkedListEX1 [balance=" + balance + ", acno=" + acno + ", acholder=" + acholder + "]";
	}
	public  int compareTo( LinkedListEX1 ac) {
		if(this.acholder.compareTo(ac.acholder)>0)
		  return 1;
		else if(this.acholder.compareTo(ac.acholder)<0)
		return -1;
		else 
			return 0;
	}
	
	
	

}
class Driver{
	public static void main(String[] args) 
	{
		
			LinkedList<LinkedListEX1> a=new LinkedList<LinkedListEX1>();
			a.add(new LinkedListEX1(23000,2312345435l,"Raju") );
			a.add(new LinkedListEX1(60000,2312345435l,"kakesh") );
			a.add(new LinkedListEX1(60009.09,2312345435l,"Majnu") );
			Collections.sort(a);;
			for(  LinkedListEX1 ss:a) {
				System.out.println(ss);
				
			}
	}
}
