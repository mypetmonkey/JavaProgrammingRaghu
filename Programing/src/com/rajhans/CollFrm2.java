package com.rajhans;
import java.util.ArrayList;
public class CollFrm2 {
	public static void main(String[] args) {
		ArrayList<Integer> o=new ArrayList<Integer>();
		o.add(50);
		o.add(75);
		o.add(30);
		o.add(20);
		o.add(75);
		ArrayList<Integer> o2=new ArrayList<Integer>();
		o2.add(100);
		o2.add(250);
		o2.addAll(o);
	/*	System.out.println("printing using for each loop");
		Integer sum=0;
		 for (Integer ob:o2)
	{
			 System.out.println(ob);
		 sum=sum+ob;
			 
		 }
		
		System.out.println(sum+"    sum is");   */
		System.out.println("by using for loop");
		for(int i=0;i<o2.size();i++) {
			System.out.println(o2.get(i));
		}
	}

}
