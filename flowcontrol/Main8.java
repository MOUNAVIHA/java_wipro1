package flowcontrol;
import java.util.*;
public class Main8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		String rev="";
		while(a!=0) {
			int b=a%10;
			rev=rev+b;
			a=a/10;
		}
		if(rev.equals(String.valueOf(temp))) {
			System.out.print(temp+" is a Palindrome");
		}
		else {
			System.out.print(temp+" is not a Palindrome");
		}
	}

}
