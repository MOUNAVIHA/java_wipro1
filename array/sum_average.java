package array;
import java.util.Scanner;
public class sum_average {
	public static void main(String[] args) {
			        Scanner sc = new Scanner(System.in);
				        
				        
				        System.out.print("Enter the number of elements: ");
				        int n = sc.nextInt();
				        
				        int[] arr = new int[n];
				        int sum = 0;
				        
				       
				        System.out.println("Enter " + n + " elements:");
				        for (int i = 0; i < n; i++) {
				            arr[i] = sc.nextInt();
				            sum += arr[i]; 
				        }
				        
				        
				        double avg = (double) sum / n;
				        
				    
			        System.out.println("Sum of array elements: " + sum);
			        System.out.println("Average of array elements: " + avg);
			        
				        sc.close();
				    
			}

}
