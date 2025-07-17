package flowcontrol;
import java.util.Scanner;
class Ex{
	public static void interest(String g,int age) {
		if(g.equalsIgnoreCase("Female") && age>=1 && age<=58) {
			System.out.println("The percentage of Interest is 8.2%");
		}
		else if(g.equalsIgnoreCase("Female") && age>=59 && age<=100) {
			System.out.println("The percentage of Interest is 9.2%");
		}
		else if(g.equalsIgnoreCase("Male") && age>=1 && age<=58) {
			System.out.println("The percentage of Interest is 8.4%");
		}
		else if(g.equalsIgnoreCase("Male") && age>=59 && age<=100) {
			System.out.println("The percentage of Interest is 10.5%");
		}
	}
}
public class Main13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String  s1 = sc.nextLine();
		int age = sc.nextInt();
		Ex.interest(s1,age);
	}

}


