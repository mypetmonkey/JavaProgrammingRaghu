package org.ragusir.Array2D;
import java.util.Scanner;
public class Matrix {
	public int[][] readMat(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the order of the matrix");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][]mat=new int[row][col];
		System.out.println("enter "+col*row+" elements row wise");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	
	
	
	public int[][] readMat1(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the order of 2nd  matrix");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][]mat=new int[row][col];
		System.out.println("enter "+col*row+" elements row wise");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	
	
    public void displayMat(int [][]x) {
    	for(int i=0;i<x.length;i++) {
    		for(int j=0;j<x[i].length;j++) {
    			System.out.print(x[i][j]+" ");
    		}
    		
    	System.out.println();
    }
    }
    
    
    
    public int sumOfMat(int [][]x) {
    	int sum=0;
    	for(int i=0;i<x.length;i++) {
    		for(int j=0;j<x[i].length;j++) {
    			sum=sum+x[i][j];
    		}
    	}
    	return sum;
    }
    
    
     
    public int getBig(int [][]x) {
    	int big=x[0][0];
    	for(int i=0;i<x.length;i++) {
    		for(int j=0;j<x[i].length;j++) {
    			if(big<x[i][j])
    				big=x[i][j];
    		}
    	}
    	return big;
    }
    
    
    
    public int getSmall(int [][]x) {
    	int small=x[0][0];
    	for(int i=0;i<x.length;i++) {
    		for(int j=0;j<x[i].length;j++) {
    			if(small>x[i][j])
    				small=x[i][j];
    		}
    	}
    	
    	return small;
     }
    
    
    
    
    public int[] countEO(int [][]x){
    	int ec=0,oc=0;
    	for(int i=0;i<x.length;i++) {
    		for(int j=0;j<x[i].length;j++) {
    			if(x[i][j]%2==0)
    				ec++;
    			else
    				oc++;
    		}
    	}
    	int []b= {ec,oc};
    	return b;
    }
    
    
    
    
    public int sumOf2Matix(int [][]x) {
    	int sum1=0,sum2=0;
    	for(int i=0;i<x.length;i++) {
    		for(int j=0;j<x[i].length;j++) {
    			sum1=sum1+x[i][j];
    		}
    	}
    for(int i=0;i<x.length;i++) {
    		for(int j=0;j<x[i].length;j++) {
    			sum2=sum2+x[i][j];
    		}
    	}
    	return sum1+ sum2;
    }
    
    
  
    
    public int getPrime(int [][]x) {
    	int count=0;
    	 for(int i=0;i<x.length;i++) {
    		 for(int j=0;j<x[i].length;j++) {
    			 boolean b=prime(x[i][j]);
    			 if (b)
    				 count++;
    		 }
    	 }
     return count;
    }
    
   public boolean prime(int x) {
	   for(int i=2;i<=x/2;i++) {
		   if(x%i==0)
			   return false;
			    }
	   return true;
	  }
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
}
    
    
    
    
    
    
    
    

    
    
    
    
    
