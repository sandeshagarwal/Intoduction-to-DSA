
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the number n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++)
		    for(int j=1;j<=i;j++)
		        sum ++; // Time Complexity O(n*n) - Worst
		//int sum = n*((n+1)/2); // Direct Formula to calculate sum (Time Complexity O(1)) -Best
		System.out.println("The sum is "+ sum);
	}
}
