package ramya;

import java.util.Scanner;

public class pro_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
for(int i=0;i<a;i++) {
	System.out.print("*"+" ");
}
System.out.println("");
for(int i=0;i<a;i++) {
	System.out.print("*");
	for(int j=0;j<(a*2)-3;j++) {
		System.out.print(" ");
	}
		System.out.print("*");
	
System.out.println("");
}
for(int i=0;i<a;i++) {
	System.out.print("*"+" ");
}
	}

}
