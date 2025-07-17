package array;
import java.util.Scanner;

public class TargetIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input target element
        System.out.print("Enter the target element to find: ");
        int target = sc.nextInt();
        
        // Find target index
        int index = -1; // default value if not found
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i; // store index if found
                break; // exit loop as target found
            }
        }
        
        // Output
        System.out.println("Index of target element: " + index);
        
        sc.close();
    }
}
