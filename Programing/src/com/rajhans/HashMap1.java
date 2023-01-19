package com.rajhans;
import java.util.HashMap;
public class HashMap1  {
	String name;
	int rollno;
	float perc;
	public HashMap1(String name, int rollno, float perc) {
		this.name = name;
		this.rollno = rollno;
		this.perc = perc;
	}
	@Override
	public String toString() {
		return "HashMap1 [name=" + name + ", rollno=" + rollno + ", perc=" + perc + "]";
	}
	

}
class DriverHashMap{
	public static void main(String[] args) {
		HashMap <Integer,HashMap1> hm=new HashMap<Integer,HashMap1>();
		hm.put(20,new HashMap1("raju",102,67.3f));
		hm.put(22,new HashMap1("balu",104,94.3f));
		hm.put(24,new HashMap1("kaju",105,77.3f));
		hm.put(25,new HashMap1("mallu",107,99.3f));
		hm.put(24,new HashMap1("neeraj",108,70.3f));
		System.out.println(hm);
		hm.remove(20);
		hm.entrySet();
		System.out.println(hm.keySet());
     System.out.println(hm);
	
}}