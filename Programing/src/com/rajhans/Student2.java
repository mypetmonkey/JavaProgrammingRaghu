package com.rajhans;

import java.util.*;

public class Student2 {
	String name;
	int id;
	public Student2(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	public String toString() {
		return "name="+name+"   id="+id;
	}

}
class DriveStd{
	public static void main(String[] args) {
		HashMap<String,Student2> hm=new HashMap<String,Student2>();
		
		hm.put("Student1",new Student2("meena",201));
		hm.put("Student2",new Student2("ajay",102));
		hm.put("Student3",new Student2("pooja",108));
		hm.put("Student4",new Student2("kiran ",701));
		System.out.println(hm);
		}
	}
