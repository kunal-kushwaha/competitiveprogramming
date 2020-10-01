package Data_Structures_And_Algorithms.Recursion;

public class recursionBasic {
	public static void main(String[] args) {
		// Problem 1. - Find the sum of first N natural numbers using Recursion
		// Problem 2. - Calculate power using recursion a ^ b	+ Fast Power
		// Problem 3. - Find all the paths in nxm matrix
		
		System.out.println(sum(5));
		System.out.println(pow(2, 10));
		System.out.println("steps are " + stepCount);
		System.out.println("Total Paths are " + path(4, 4));
	} 
	
	static int sum(int n) {
		// problem 1.
		if(n == 1) return 1;
		else {
			
			return n + sum(n-1) ;
		}
	}
	
	static int stepCount = 0;
	static int pow(int a, int b) {
		System.out.println(b);
		stepCount++;
		// problem 2.
		if(b == 0) return 1;
		else if(b%2 != 0) {
			return a * pow(a, b-1);
		}
		return pow(a*a, b/2);
	}
	
	static int path(int row, int col) {
		if(row == 1 || col == 1) return 1;
		
		return path(row, col -1 ) + path(row -1 , col);
	}
}
