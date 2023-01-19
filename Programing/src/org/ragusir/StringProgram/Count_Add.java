package org.ragusir.StringProgram;

public class Count_Add {
	public static void main(String[] args) {
		String s="abc";
		int sum=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
				sum=sum+(ch-96);
		}
		System.out.println(sum);
	}

}
