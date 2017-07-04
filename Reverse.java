package maniya;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int rev=reverse(a);
		System.out.println(rev);
		}

	  public static int reverse(int n) {
	       int result = 0;
	       int rem;
	       while (n > 0) {
	           rem = n % 10;
	           n = n / 10;
	           result = result * 10 + rem;
	       }
	       return result;

	}}
