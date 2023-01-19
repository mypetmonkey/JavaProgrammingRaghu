package com.rajhans;

public class EncpsulDemo {
private	String bname;
private	String brand;
private	double price;
	public EncpsulDemo(String bname, String brand, double price) {
		this.bname = bname;
		this.brand = brand;
		this.price = price;
	}
	
  public String getBname() {
	  return bname;
  }
  public String getBrand() {
	  return brand;
  }
  public double setPrice(double p) {
	 this.price=p;
	 return p;
  }
}
class ExecuteDemo{
	public static void main(String[] args) {
		EncpsulDemo ed=new EncpsulDemo("ns 200","pulsar",150000.00);
		System.out.println(ed.getBname());
		System.out.println(ed.getBrand());
		System.out.println(ed.setPrice(200000));
	}
}