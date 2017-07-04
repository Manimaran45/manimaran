package maniya;

import java.util.Scanner;

public class Vowels {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		StringBuffer s2=new StringBuffer(s1);
		String rev=s2.reverse().toString();
		String vow=rev.replaceAll("[aeiouAEIOU]", "");
		System.out.println(vow);
				
				
			 
	}

}
