package com.rajhans;

import java.util.Collections; 
import java.util.LinkedList;

public class Human implements Comparable<Human> {
	String name;
	int age;
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	public int compareTo(Human h) {
		if(this.age>h.age)
			return 1;
		if(this.age<(h.age))
			return -1;
		else
			return 0;
	}
	

}
class DriverHuman{
	public static void main(String[] args) {
		LinkedList<Human> h1=new LinkedList<Human>();
		h1.add(new Human("raju",23));
		h1.add(new Human("mukesh",28));
		h1.add(new Human("yash",20));
		Collections.sort(h1);
		for(Human hh:h1) {
			System.out.println(hh);
		}
		for(int i=0;i<h1.size();i++) {
			System.out.println(h1.get(i));
		}
	}
}
