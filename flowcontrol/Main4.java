package flowcontrol;
import java.util.*;
public class Main4 {
	public static Boolean isPrime(int a) {
		if(a<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(a);i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int st=sc.nextInt();
		int en=sc.nextInt();
		for(int i=st;i<=en;i++) {
		if(isPrime(i)) {
		System.out.println(i+" ");
		}
		}
	}

}
