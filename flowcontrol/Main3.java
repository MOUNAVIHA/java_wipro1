package flowcontrol;
import java.util.*;
public class Main3 {
	public static Boolean isPrime(int a) {
		if(a<=1) {
			return false;
		}
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean a=isPrime(num);
		if(a) {
		System.out.println(num+" is a Prime Number");
		}
		else {
			System.out.println(num+" is not a Prime Number");
		}
	}

}


