package com.rajhans;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentItr {
	String name;
      int age; 
	public StudentItr(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "StudentItr [name=" + name + ", age=" + age + "]";
	}
	
}
class driverIter{
	public static void main(String[] args) {
		ArrayList<StudentItr> al=new ArrayList<StudentItr>();
		al.add(new StudentItr("Raju",45));
		al.add(new StudentItr("vikash",35));
		//al.add(null);
		al.add(new StudentItr("birju",25));
		System.out.println("printing with iterator");
		Iterator<StudentItr> ob=al.iterator();
		while(ob.hasNext()==true) {
			//Object obj=ob.next();
			//StudentItr ob2=(Object)obj;
			StudentItr s1=ob.next();
			if(s1.age==35)
				ob.remove();
		}
			System.out.println(al);
		
	}
}