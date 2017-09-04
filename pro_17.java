package ramya;

import java.util.Scanner;

public class pro_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int d=a;
int c=1;
while(a>0) {
 int b=a%10;
  c=c*b;
 a=a/10;
}
System.out.print(d*c);
	}

}
