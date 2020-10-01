package Data_Structures_And_Algorithms.Recursion.problems;

public class stringReverseRecursion {
	public static void main(String[] args) {
		// reverse a string using recursion
		
		String s = "pulkit";
		System.out.println(stringRev(s));
		
	}
	
	static String stringRev(String str) {
		int i = 0;
		if(str.length() == 1) return str;
		System.out.print(str.charAt(str.length()-1));
		return stringRev(str.substring(0, str.length()-1));
	}
}
