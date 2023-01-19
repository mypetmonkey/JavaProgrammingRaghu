package com.rajhans;

import java.util.*;

public class ListItr {
     String name;
	int age;
	public ListItr(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "ListItr [name=" + name + ", age=" + age + "]";
	}
	}
class DriverListItr{
	
	public static void main(String[] args) {
		ArrayList<ListItr> al=new ArrayList<ListItr>();
		al.add(new ListItr("Jaguar",34));
		al.add(new ListItr("mohan",65));
		al.add(new ListItr("rinku",12));
		al.add(new ListItr("rishu",23));
		System.out.println("printing with ListIterator");
		ListIterator<ListItr> ob=al.listIterator();
		System.out.println("printing with forward direction");
		while(ob.hasNext()==true)
		{
			System.out.println(ob.next());
		} 
		System.out.println("backward direction");
		while(ob.hasPrevious()==true) {
			System.out.println(ob.previous());
		}
		System.out.println("after set some data");
		while(ob.hasPrevious()==true) {
			
			 ListItr i=ob.previous();
	
			 if(i.age==65)
				 ob.set(new ListItr("dadu",99));
		}
			
			System.out.println(al);
		}
	}
	
