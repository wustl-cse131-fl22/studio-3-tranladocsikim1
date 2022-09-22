package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = in.nextInt();
		int[] numbers = new int[n];
		
		for (int x = 0; x < numbers.length - 1; x++) { 
			numbers[x] = x + 2;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			for (int j = 2; j < numbers.length - 1; j++) {
				if (numbers[j] % i == 0 && numbers[j] != i) {
					numbers[j] = 0;	
				}
			}	
		}
		
		for (int z = 0; z < numbers.length - 1; z++) {
			if (numbers[z] != 0) {
				System.out.print(numbers[z] + " ");
			}
		}
	}
}
	


