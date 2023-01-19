package com.rajhans;
import java.util.*;
public class CollFrm1 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter your data");
	   Object o=sc.next();
	ArrayList<Object> a=new ArrayList<Object>();
	a.add("SQL");
	a.add("java");
	a.add(120.2);
	a.add("SQL");
	a.add(55.5);
	a.add(100);
	a.add("java");
	a.add(o);
	
     //  a.remove(2);
	System.out.println(a);
	
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
		int index=a.indexOf("SQL");
		a.remove(index);
		System.out.println("After removing SQL ,list is"+a);
		System.out.println(a.contains("SQL"));
		System.out.println("now size of list is  "+a.size());
		
}
}
