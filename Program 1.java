
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the number n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = n*((n+1)/2); // Direct Formula to calculate sum
		System.out.println("The sum is "+ sum);
	}
}
