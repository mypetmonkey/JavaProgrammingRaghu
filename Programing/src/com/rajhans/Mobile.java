package com.rajhans;
import java.util.*;
class Mobile implements Comparable<Mobile > {
	
	
	double price;
	String brand;
	String colour;
	
	public Mobile(double price,String brand,String colour) {
		
		this.price=price;
		this.brand=brand;
		this.colour=colour;
	}
	
public int compareTo(Mobile m)
{
	if(this.price>m.price)
		return 1;
	else if(this.price<m.price)
		return -1;
	else
		return 0;

}

public String toString() {
	return "Mobile [price=" + price + ", brand=" + brand + ", colour=" + colour + "]";
}


}
class DeriverMobile{
	public static void main(String[] args) {
		ArrayList<Mobile> al=new ArrayList<Mobile>();
		al.add(new Mobile(60000,"samsung","yellow"));
		al.add(new Mobile(23000,"oneplus","blue"));
		al.add(new Mobile(2300,"nokia","black"));
		Collections.sort(al);;
		System.out.println(al);
		for(Mobile m1:al)
		{
			System.out.println(m1);
		}
		
	}
}
