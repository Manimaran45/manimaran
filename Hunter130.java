package maniya;

import java.util.Scanner;

public class Hunter130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     String str=s.next();
     if(str.equalsIgnoreCase("monday")||str.equalsIgnoreCase("tuesday")||str.equalsIgnoreCase("wednesday")||
    		 str.equalsIgnoreCase("thrusday")||str.equalsIgnoreCase("friday")||str.equalsIgnoreCase("mon")||
    		 str.equalsIgnoreCase("tue")||str.equalsIgnoreCase("wed")||str.equalsIgnoreCase("thrus")||
    		 str.equalsIgnoreCase("fri")){
    	 System.out.println("true");
    	 }
     if(str.equalsIgnoreCase("saturday")||str.equalsIgnoreCase("sunday")||
    		 str.equalsIgnoreCase("sat")||str.equalsIgnoreCase("sun")){
    	 System.out.println("false");
    			 }
    		 }
    	 
     }
