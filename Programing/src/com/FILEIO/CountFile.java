package com.FILEIO;

import java.io.File;

public class CountFile {
	public static void main(String[] args) {
		int count=0;
		File f=new File("D:\\practice");
		String[] s = f.list();
		for(String cnt:s) {
			File f1=new File(f,cnt);
			if(f1.isFile())
				count++;
			System.out.println(cnt);
		}
		System.out.println("total "+count);
		
	}

}
