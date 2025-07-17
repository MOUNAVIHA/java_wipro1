package flowcontrol;
import java.util.*;
public class Main9 {
	public static Boolean lastdigit(int n1,int n2) {
		if(n1%10==n2%10) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1 and Number 2 :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print(lastdigit(num1,num2));
	}

}
