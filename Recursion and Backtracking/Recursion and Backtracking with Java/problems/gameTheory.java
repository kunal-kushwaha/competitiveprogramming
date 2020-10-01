package Data_Structures_And_Algorithms.Recursion.problems;

public class gameTheory {

	public static void main(String[] args) {
		int a[] = {1, 500, 200, 4};
		int left = 0;
		int right = a.length -1;
		System.out.println(coinGame(a, left, right));

	}
	
	public static int coinGame(int a[], int left, int right) {
		if(left + 1 == right) return Math.max(a[left], a[right]);
		
		return Math.max(a[left] + Math.min(coinGame(a, left + 2, right), coinGame(a, left + 1, right - 1)), 
					   a[right] + Math.min(coinGame(a, left + 1, right -1), coinGame(a, left, right -2)));
	}

}
