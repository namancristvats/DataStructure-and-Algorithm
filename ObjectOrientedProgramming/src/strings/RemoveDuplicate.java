package strings;

import java.util.Scanner;

public class RemoveDuplicate {
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()==0)
		{
			return"";
		}
		if(s.length()==1)
		{
			return s;
		}
		int i=0;
		if(s.charAt(i)==s.charAt(i+1))
		{
			return removeConsecutiveDuplicates(s.substring(1));
		}
		else {
		return s.charAt(0)+removeConsecutiveDuplicates(s.substring(1));
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(removeConsecutiveDuplicates(str));

	}

}
