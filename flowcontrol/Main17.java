package flowcontrol;

import java.util.*;
class Main17{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		if(num<0) {
			System.out.println("The given number is Negative");
		}
		else if(num==0) {
			System.out.println("The given number is Zero");
		}
		else {
			System.out.println("The given number is Positive");
		}
	}
}

