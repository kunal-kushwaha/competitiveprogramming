package Data_Structures_And_Algorithms.Recursion.problems.backTracking;

import java.util.ArrayList;

public class partitionArrayIntoTwoEqualSumArrays {

	public static void main(String[] args) {
		 int a[] = {3, 1, 5, 2, 1};
		 int sum = 0;
		 for(int i = 0;i<a.length;i++) sum += a[i];
		 
		 // sum&1 means if last bit is 0 means the number is even and if last bit is one then the number is odd
		 ArrayList<Integer> al = new ArrayList<>();

		 boolean isPossible = (sum&1) == 0 && partition(a, sum/2, 0, al);
		 
		 if(isPossible) {
			 for(int x : al) {
				 System.out.print(x + " ");
			 }
		 }
		 else
			 System.out.println("not possible");

	}
	
	static boolean partition(int a[], int sum, int i, ArrayList<Integer> al) {
		if(i >= a.length || sum < 0) {
				return false;
		}
		if(sum == 0) return true;
		al.add(a[i]);
		boolean leftPossible = partition(a, sum-a[i], i+1, al);
		
		if(leftPossible) return true;
		// this particualr line makes backtracking
		al.remove(al.size() -1);
		return partition(a, sum, i+1, al);
			
	}

}
