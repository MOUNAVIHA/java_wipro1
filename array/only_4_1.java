package array;
import java.util.Scanner;
public class only_4_1 {
	

	
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        
         System.out.print("Enter number of elements: ");
         int n = sc.nextInt();
         
         int[] arr = new int[n];
         
       
         System.out.println("Enter " + n + " elements:");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         
         boolean only1and4 = true;
         
         
         for (int i = 0; i < n; i++) {
             if (arr[i] != 1 && arr[i] != 4) {
                 only1and4 = false;
                 break;
             }
         }
         
         
         System.out.println("Array contains only 1's and 4's: " + only1and4);
         
         sc.close();
     }
 }