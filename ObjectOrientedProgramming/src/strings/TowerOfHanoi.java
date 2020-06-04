package strings;
import java.util.Scanner;
public class TowerOfHanoi {
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		
		if(disks==1)
		{
			System.out.println(source+" "+destination);
		}else {
		   towerOfHanoi(disks-1,source,destination,auxiliary);
			System.out.println(source+" "+destination);
			towerOfHanoi(disks-1,auxiliary,source,destination);
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char a='a';
		char b='b';
		char c='c';
		towerOfHanoi(n,a,b,c);

	}

}
