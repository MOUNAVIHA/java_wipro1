
package array;
import java.util.Scanner;
public class btw_6_7 {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number of elements: ");
         int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter " + n + " elements:");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         
         int sum = 0;
         boolean skip = false;
         
        
         for (int i = 0; i < n; i++) {
             if (arr[i] == 6) {
                 sum += arr[i]; 
                 skip = true;   
             } else if (arr[i] == 7 && skip) {
                 sum += arr[i]; 
                 skip = false;  
             } else if (!skip) {
                 sum += arr[i]; }
         }
         
         // Output result
         System.out.println("Sum (adding 6 and 7 but not between them): " + sum);
         
         sc.close();
     }
 }