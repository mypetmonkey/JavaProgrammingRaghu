package Array;

public class ArrayMerge {
	public static void main(String[] args) {
		int a[]= {1,3,5,7,9};
		int b[]= {2,4,6,8};
		int c[]=new int[a.length+b.length];
		int i=0,k=0;
		while(a.length>i&&b.length>i) {
			c[k]=a[i];
			k++;
			c[k]=b[i];
			i++;
			k++;
		}
		while(i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(i<b.length) {
			c[k]=b[i];
			k++;
			i++;
		}
		for(int j=0;j<c.length;j++) {
			System.out.print (c[j]+" ");
		}
		
	}

}
