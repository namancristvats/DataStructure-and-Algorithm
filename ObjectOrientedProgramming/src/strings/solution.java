package strings;

import java.util.Scanner;

public class solution {
	public static String removeX(String input)
	{
		if(input.length()<1)
		{
			return input;
		}
		if(input.startsWith("x"))
		{
			return removeX(input.substring(1,input.length()));
		}
		return input.charAt(0)+removeX(input.substring(1,input.length()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeX(s));
        char c=1;
        char n=2;
        System.out.println((int)c+(int)n);
	}

}
