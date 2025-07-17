package flowcontrol;
import java.util.*;
public class Main10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String  s1 = sc.nextLine();
		String  s2 = sc.nextLine();
		if(s1 ==null && s2 == null) {
			System.out.print("No values");
		}
		else {
			System.out.print(s1+","+s2);
		}
		
	}

}
