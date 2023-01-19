package com.rajhans;
import java.util.*;
public class Student {
	String name;
	int id;
	String branch;
	public Student(String name, int id, String branch) {
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		
		
		al .add(new Student("rajhans",102,"chem"));
		al.add(new Student("vinayak",234,"ece"));
		al.add(new Student("ravi",123,"cse"));
		al.add(new Student("aswin",123,"mech"));
		for(Object i:al) {
			System.out.println(i);
		}
		System.out.println(al);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", branch=" + branch + "]";
	}

}
