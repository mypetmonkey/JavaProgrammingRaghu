package com.rajhans;
import java.util.*;
public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(56);
		al.add(234);
		al.add(100);
		al.add(88);
		al.add(null);
		for(Integer i:al)
		{
			System.out.println(i+" ");
		}
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

}
class Coll2{
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("56");
		al.add("Raj");
		al.add("Btm");
		al.add("Hans");
		al.add("jspider");
		Collections.sort(al);
		System.out.println(al);
	}
}
