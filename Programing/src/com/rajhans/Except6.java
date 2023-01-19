package com.rajhans;

public class Except6 {
	public static void main(String[] args) {
		
		String s="india";
		try {
		for(int i=0;i<=s.length();i++)
		{
			System.out.println(s.charAt(i));
			
		}
		System.out.println("what are you doing");
		
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception occured,continue");
		}
		System.out.println(s.toUpperCase());
	}

}
