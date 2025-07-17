package array;
import java.util.Scanner;
public class remove_duplicate {
	


     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         
         System.out.print("Enter the number of elements: ");
         int n = sc.nextInt();
         
         int[] arr = new int[n];
         
        
         System.out.println("Enter " + n + " elements:");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         
         
         int[] temp = new int[n];
         int j = 0;
         
         for (int i = 0; i < n; i++) {
             boolean isDuplicate = false;
             for (int k = 0; k < j; k++) {
                 if (arr[i] == temp[k]) {
                     isDuplicate = true;
                     break;
                 }
             }
             if (!isDuplicate) {
                 temp[j] = arr[i];
                 j++;
             }
         }
         
         
         System.out.println("Array after removing duplicates:");
         for (int i = 0; i < j; i++) {
             System.out.print(temp[i] + " ");
         }
         
         sc.close();
     }
 }

