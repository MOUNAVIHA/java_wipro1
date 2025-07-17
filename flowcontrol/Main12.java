package flowcontrol;
import java.util.*;
public class Main12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		if(Character.isLetter(ch1)) {
			System.out.print("Alphabhet");
		}
		else if(Character.isDigit(ch1)) {
			System.out.print("Digit");
		}
		else {
			System.out.print("Special Character");
		}
	}

}
