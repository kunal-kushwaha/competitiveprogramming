package Data_Structures_And_Algorithms.Recursion.problems;

public class stringPalindrome {
	public static void main(String[] args) {
		// Check if a string is palindrom or not using Recursion
		String s = "malayalam";
		int start = 0;
		int end = s.length() -1;
		System.out.println(stringPalindrome(s, start, end));
		System.out.println("steps are " + stepCount);
	}
	
	static int stepCount = 0;
	
	public static boolean stringPalindrome(String str, int start, int end) {
	stepCount++;
		if(start > end || start == end) return true;
		
		if(str.length() == 1) return true;

		else if(str.charAt(start) != str.charAt(end))
			return false;
		
		return stringPalindrome(str, start + 1, end -1);
	}
}
