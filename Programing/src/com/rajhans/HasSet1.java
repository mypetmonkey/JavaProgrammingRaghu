package com.rajhans;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
public class HasSet1 {
   public static void main(String[] args) {
	
	 HashSet<Float> h=new HashSet<Float>(); 
	 h.add(23.4f);
	 h.add(45.99f);
	 h.add(55.55f);
	 h.add(778.87f);
	 h.add(23.4f);
	   
	   Iterator<Float> f=h.iterator();
	   while(f.hasNext())
	   {
		   System.out.println(f.next());
	   }
	   for(Float i:h) {
		   System.out.println(i);
	   }
	   TreeSet<Float> t=new TreeSet<Float>(h);
	   System.out.println(t);
}
}
