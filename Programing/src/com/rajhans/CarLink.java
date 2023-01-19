package com.rajhans;

import java.util.Collections;
import java.util.LinkedList;

public class CarLink  implements Comparable< CarLink>{
	String brand;
	double price;
	String colour;
	public CarLink(String brand, double price, String colour) {
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "CarLink [brand=" + brand + ", price=" + price + ", colour=" + colour + "]";
	}
	public  int compareTo( CarLink cl) {
		if(this.colour.compareTo(cl.colour)>0)
		  return 1;
		else if(this.colour.compareTo(cl.colour)<0)
		return -1;
		else 
			return 0;
	}

}
class DriverCar{
	public static void main(String[] args) {
		LinkedList<CarLink> cl=new LinkedList<CarLink>();
		cl.add(new CarLink("tyoya",2300000,"yellow") );
		cl.add(new CarLink("bmw",8000000,"white") );
		cl.add(new CarLink("audi",230000000,"blue") );
		Collections.sort(cl);
		for(CarLink aa:cl) {
			System.out.println(aa);
			
		}
	}
}
