package com.rajhans;

public class Except5 {
	public static void main(String[] args) {
		System.out.println("stsrt");
		String s="Rajhans";
		try {
			System.out.println(s.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("end");
		}
	}

}
