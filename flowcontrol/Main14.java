package flowcontrol;

import java.util.Scanner;
public class Main14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		if(Character.isLowerCase(ch1)) {
			System.out.println(ch1+"->"+Character.toUpperCase(ch1));
		}
		else if(Character.isUpperCase(ch1)) {
			System.out.println(ch1+" -> "+Character.toLowerCase(ch1));
		}
	}

}
