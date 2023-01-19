package com.rajhans;

import java.util.Collections;
import java.util.HashSet;

public class Hashset1 {
	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<Object>();
		hs.add("Raju");
		hs.add(102);
		hs.add("Raju");
		hs.add(102);
		hs.add("btm");
		System.out.println(hs);
	}

}
