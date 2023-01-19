package com.rajhans;
import java.util.*;
public class Set2 implements Comparable<Set2>
{
	String name;
	String pwd;
	long phno;
	public Set2(String name, String pwd, long phno) {
		this.name = name;
		this.pwd = pwd;
		this.phno = phno;
	}
	public String toString() {
		return "Set2 [name=" + name + ", pwd=" + pwd + ", phno=" + phno + "]";
	}
	public int compareTo(Set2 s) {
		if(this.name.compareTo(s.name)>0)
			return 1;
		else if
		(this.name.compareTo(s.name)<0)
			return -1;
		else
			return 0;
	}
	
}
class driverFb{
	public static void main(String[] args) {
		
		HashSet<Set2> h=new HashSet<Set2>();
		h.add(new Set2("raju","123@raj",9876543210l));
		h.add(new Set2("balu","balu@123",9076543254l));
		h.add(new Set2("zoya","Zoya@123",9276543210l));
		h.add(new Set2("amar","amar@123",9876543245l ));
	  System.out.println("random -----------------");
		
		for(Set2 r:h ) {
			System.out.println(r);
		}
		System.out.println("sorted-----------------");
		TreeSet<Set2> t=new TreeSet<Set2>(h);
		for(Set2 i:t) {
			System.out.println(i);
		}
		
	}
}