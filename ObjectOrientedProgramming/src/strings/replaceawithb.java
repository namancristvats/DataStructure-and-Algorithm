package strings;
import java.util.Scanner;
public class replaceawithb {
           public static String replaceCharacter(String input, char c1, char c2) {
        	   if(input.length()==0)
        	   {
        		   return input;
        	   }
        	   if(input.charAt(0)== c1)
        	   {
        		   return c2+replaceCharacter(input.substring(1),c1,c2);
        	   }
        	   return input.charAt(0)+replaceCharacter(input.substring(1),c1,c2);
           }
           public static void main(String[] args) {
        	   Scanner sc=new Scanner(System.in);
        	   String str=sc.nextLine();
        	   String s=sc.nextLine();
//        	   String st[]=s.split(" ");
        	   char c[]=s.toCharArray();
        	   System.out.println(replaceCharacter(str,c[0],c[2]));
        	   
           }
}
