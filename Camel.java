package maniya;

import java.util.Scanner;

public class Camel {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String str[]=s1.split(" ");
		for(String a:str){
			System.out.print((Character.toUpperCase(a.charAt(0)))+a.substring(1, a.length()));
			
		}
	}

}
