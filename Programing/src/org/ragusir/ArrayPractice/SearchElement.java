package org.ragusir.ArrayPractice;

public class SearchElement {
	public static void main(String[] args) {
		int ar[]= {23,45,67,65,43,-23};
		int ele=-2;
		int s=search(ar,ele);
		if(s==-1)
			System.out.println("not present");
		else
			System.out.println("index number is "+s);
	
	}
	static int search(int ar[],int ele) {
		for(int i=0;i<ar.length;i++) {
	if(ar[i]==ele)
		return i;
}
return -1;

}
}