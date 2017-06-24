package JAVA;

import java.util.Scanner;

public class Rev1 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		StringBuffer s2=new StringBuffer(s1);
		System.out.println(s2.reverse());
	}
}
