package com.rajhans;
import java.io.*;
public class FileEx {
public static void main(String[] args) throws IOException
{
	File f=new File("D://file//A.txt");
	PrintWriter p=new PrintWriter(f);
	p.println("this is an example");
	p.println(100);
	p.println("raju");
	p.println("khurana");
	p.println(" ");
	p.close();
	FileReader fr=new FileReader(f);
	BufferedReader bf=new BufferedReader(fr);
	String s=bf.readLine();
	System.out.println("reading from file");
	while(s!=null) {
		System.out.println(s);
		s=bf.readLine(); 
	}
}	

}
