package org.ragusir.Array2D;

public class Sum2DArray {
	public static void main(String[] args) {
		Matrix mat=new Matrix();
		int [][]ar=mat.readMat();
		int [][]ar1=mat.readMat1();
				
		//System.out.println("user enterd matrix");
		//mat.displayMat(ar);
		
		
		
		//int sm=mat.sumOfMat(ar);
		//System.out.println("sum of matrix is  "+sm);
		
		//int bg=mat.getBig(ar);
		//System.out.println("biggest value of this matrix is "+bg);
		
		
		
		//int chota=mat.getSmall(ar);
		//System.out.println("Smallest value of this matrix is "+chota);
		
		
		//int []cnt=mat.countEO(ar);
		//System.out.println("total even "+cnt[0]);
		//System.out.println("total odd "+cnt[1]);
		
		
		int sum=mat.sumOf2Matix(ar);
		 System.out.println("sum of 2 given matrix is  "+sum);
		
		//int cnt=mat.getPrime(ar);
		//System.out.println("total prime no are "+cnt);
		
	}

}
