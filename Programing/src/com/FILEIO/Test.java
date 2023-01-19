package com.FILEIO;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		int count=0;
		File f=new File("D:\\oops");
		String[] s = f.list();
		for(String cnt:s) {
			System.out.println(cnt);
			count++;
		}
		System.out.println(count);
	}

}
