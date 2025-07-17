	package array;
	import java.util.Scanner;
	public class ASCII_to_character {		
		public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number of ASCII values: ");
		        int n = sc.nextInt();
		        
		        int[] arr = new int[n];
		        System.out.println("Enter " + n + " ASCII values:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }
		        System.out.println("Corresponding characters:");
		        for (int i = 0; i < n; i++) {		            char ch = (char) arr[i];
		            System.out.print(ch + " ");
		        }
		        
		        sc.close();
		    }
		}
	
