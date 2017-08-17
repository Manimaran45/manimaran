package maniya;

import java.util.Scanner;

public class Hunter123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] b=str.toCharArray();
		for(int i=0;i<str.length();i++){
			int count=-1;
		  for(int j=0;j<str.length();j++){
			  if(b[i]==b[j]){
				  count++;
			  }}
			if(count==0){
				System.out.println(b[i]);
			}
		
			
			
		}
   
	}

}
