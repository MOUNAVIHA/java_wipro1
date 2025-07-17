package flowcontrol;
import java.util.*;
class sum{
	public static int digits(int num) {
		int sum=0;
		while(num!=0) {
			int a=num%10;
			sum=sum+a;
			num=num/10;
		}
		return sum;
	}
}
public class Main5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print(sum.digits(num));
	}

}

