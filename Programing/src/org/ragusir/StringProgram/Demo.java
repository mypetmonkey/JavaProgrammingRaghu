package org.ragusir.StringProgram;

public class Demo {
	public static void main(String[] args) {
		String st="Hello";
		System.out.println(st.substring(1,5).toUpperCase());//1st Way
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='a'&&ch<='z')
				
				System.out.print((char)(ch-32));//2nd Way
			
		}
		
	}

}
