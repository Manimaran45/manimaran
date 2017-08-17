package maniya;

import java.util.Scanner;

public class Camelcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
         String str=s.next();
         int count=0;
         int c=0;
         for(int i=0;i<str.length();i++){
        	 if(str.charAt(i)>=65&&str.charAt(i)<=90){
        		count++; 
        	 }
        	 if(str.charAt(i)>=97&&str.charAt(i)<=122){
        	c=1;	 
        	 }
        	 }
         if(c==1 && count>1){
        	 System.out.println("Camelcase");
         }
         else{
        	 System.out.println("Not Camelcase");
         }
         
	}

}
