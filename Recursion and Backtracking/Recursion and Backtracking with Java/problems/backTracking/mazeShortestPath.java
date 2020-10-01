package Data_Structures_And_Algorithms.Recursion.problems.backTracking;

public class mazeShortestPath {
	public static void main(String[] args) {
		int a[][] = {
				{1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
				{0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
				{0, 0, 1, 0, 1, 1, 1, 0, 0, 1},
				{1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
				{0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
				{1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
				{0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
				{0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
				{1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
				{0, 0, 1, 0, 0, 1, 1, 0, 0, 1}
				};
		
		int result = shortestPath(a, 0, 0, 8, 0);
		if(result >= 100000)
		System.out.println("No Possible Path");
		
		else System.out.println(result);
		
	}
	
	static int shortestPath(int a[][], int i, int j, int x, int y) {
		int rows = a.length;
		int cols = a[0].length;
		
		boolean visited[][] = new boolean[rows][cols];
		
		return shortestPath(a, i, j, x, y, visited);
		
		
	}
	
	static boolean pathValid(int a[][], int i, int j, boolean visited[][]) {
		int rows = a.length;
		int cols = a[0].length;
		
		if(i >= 0 && j >= 0 && i < rows && j < cols && !visited[i][j] && a[i][j] == 1)
			return true;
		return false;
		
	}
	
	static int shortestPath(int a[][], int i, int j, int x, int y, boolean visited[][]) {
		
		if(!pathValid(a, i, j, visited)) return 100000;		
		if(i == x && j == y) return 0;	
		
		visited[i][j] = true;
		
		int left = shortestPath(a, i, j-1, x, y, visited) + 1;
		int bottom = shortestPath(a, i+1, j, x, y, visited) + 1;
		int right = shortestPath(a, i, j+1, x, y, visited) + 1;
		int top = shortestPath(a, i-1, j, x, y, visited) + 1;
		
		visited[i][j] = false;
		
		return Math.min(Math.min(left, bottom), Math.min(right, top));
		
	}
}
