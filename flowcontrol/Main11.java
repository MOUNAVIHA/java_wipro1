package flowcontrol;
import java.util.*;
public class Main11 {
	public void Char(char ch1,char ch2) {
		if(ch1=='s'&& ch2=='e') {
			System.out.print(ch2+","+ch1);
		}
		else if(ch1=='a'&& ch2=='e') {
			System.out.print(ch1+","+ch2);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		char ch2=sc.next().charAt(0);
		Main4 obj=new Main4();
		obj.Char(ch1, ch2);		
	}

}
