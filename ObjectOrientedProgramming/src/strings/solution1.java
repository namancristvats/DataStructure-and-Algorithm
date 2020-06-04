package strings;

import java.util.Scanner;
import java.lang.Math;

public class solution1 {
   public static int StringToInt(String input,int n) {
	   if(input.length()==1)
	   { char c1='0';
//		   char c1[]=input.toCharArray();
		 return (int)input.charAt(0)-(int)c1;
	   }
//	   char c[]=new char[input.length()];
//	   c=input.toCharArray();
	   char c='0';
	   double k=Math.pow(10, n);
	   return ((int)input.charAt(0)-c)*(int)k+StringToInt(input.substring(1),n-1);
	  
   }
   public static int convertStringToInt(String input) {
	   int n1=input.length();
	   return StringToInt(input,n1-1);
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=convertStringToInt(s);
		System.out.println(n);

	}

}
