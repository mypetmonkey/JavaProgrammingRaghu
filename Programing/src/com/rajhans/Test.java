package com.rajhans;

public class Test {
	int id;
	String name;
	
	public Test(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Test ob=new Test(103,"Raj");
		System.out.println(ob);
	}
   

}
