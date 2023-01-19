package com.rajhans;
import java.util.*;
public class ExceptEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age to check weather you are able to marry or not");
		int age=sc.nextInt();
		if(age>60)
			throw new OldException("no,you are old so not elligible to marry");
		else if(age<18)
			throw new YoungException("no,you are in child catogery not elligible tomarry");
			else
				System.out.println("yes ,you are elligible to marry");
	}

}
class OldException extends RuntimeException{
	
	OldException(String s){
		super(s);
	}
}
class YoungException extends RuntimeException{
	YoungException(String s){
		super(s);
	}
}