package org.ragusir.ArrayPractice;

public class ArrayFrequency {
	public static void main(String[] args) {
		int ar[]= {12,32,34,32,12,12,-23,55,34};
		boolean b[]=new boolean[ar.length];
		for(int i=0;i<ar.length;i++) {
			if(b[i]==false) {
				int count =1;
				for(int j=i+1;j<ar.length;j++) {
					if(ar[i]==ar[j]) {
						count++;
					b[j]=true;
				}
			}
		
	System.out.println(ar[i]+"===>"+count);
	}
	}
}
}