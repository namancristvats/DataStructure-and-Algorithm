package strings;

import java.util.Scanner;

public class solution2 {

	public static String addStars(String input) {
		if(input.length()==1)
		{
			return input;
		}
		char c1=input.charAt(0);
		char c2=input.charAt(1);
		if(c1==c2)
		{
			return c1+"*"+addStars(input.substring(1,input.length()));
		}
		return input.charAt(0)+addStars(input.substring(1,input.length()));
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(addStars(str));

	}

}
