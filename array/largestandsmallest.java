package array;
import java.util.Scanner;
public class largestandsmallest {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();
	        
	        if (n < 2) {
	            System.out.println("Array should have at least two elements.");
	            return;
	        }
	        
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = arr[i];
	            }
	        }
	        
	        
	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;
	        
	        
	        for (int i = 0; i < n; i++) {
	            if (arr[i] < smallest) {
	                secondSmallest = smallest;
	                smallest = arr[i];
	            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
	                secondSmallest = arr[i];
	            }
	        }
	        
	       
	        System.out.println("Largest number: " + largest);
	        System.out.println("Second largest number: " + secondLargest);
	        System.out.println("Smallest number: " + smallest);
	        System.out.println("Second smallest number: " + secondSmallest);
	        
	        sc.close();
	    
	    }}
