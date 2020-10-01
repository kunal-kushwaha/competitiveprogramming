package Data_Structures_And_Algorithms.Recursion.problems;
import java.util.*;
public class permutationsOfString {

	static Set<String> set = new HashSet<>();
	public static void main(String[] args) {
		String s = "abc";
		int left = 0;
		int right = s.length() - 1;
		permutations(s, left, right);
	}
	
	static void permutations(String str, int left, int right) {
		if(left == right) {
			if(set.contains(str)) return;
			set.add(str);
			System.out.println(str);
		}
		
		for(int i = left;i<=right;i++) {
			str = swap(str, left, i);
			permutations(str, left+1, right);
			str = swap(str, left, i);
		}
	}
	
	static String swap(String str, int left, int right) {
		char array[] = str.toCharArray();
		char temp = array[left];
		array[left] = array[right];
		array[right] = temp;
		return String.valueOf(array);
	}

}
