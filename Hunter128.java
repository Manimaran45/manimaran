package maniya;

import java.util.Arrays;
import java.util.Scanner;

public class Hunter128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b[]=new int[a];
    for(int i=0;i<a;i++){
    	b[i]=s.nextInt();  
    	
	}
  Arrays.sort(b);
    
  for(int i=0;i<(a/2);i++){
	  System.out.print(b[a-(i+1)]+","+b[i]+",");
  }
  if((a%2)==1){
  System.out.println(b[a/2]);
  }
	}
}
