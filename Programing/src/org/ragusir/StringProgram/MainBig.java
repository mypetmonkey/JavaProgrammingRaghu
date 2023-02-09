package org.ragusir.StringProgram;

public class MainBig {
	public static void main(String[] args) {
		
		String st="AbCdE";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
				System.out.print(ch);
			
		}
		System.out.println();
		String str="a1b2c3";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9') {
				System.out.print(ch);
			}
		}
	}

}
