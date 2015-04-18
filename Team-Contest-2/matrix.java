import java.util.Scanner;


public class matrix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for(int tc = 1; tc <= testCases; tc++)
		{
			int[] vector = new int[in.nextInt()];
			int cols = in.nextInt();
			for(int r = 0; r < vector.length; r++)
			{
				vector[r] = in.nextInt();
				for(int c = 1; c < cols; c++)
					vector[r] = in.nextInt() - vector[r];
			}
			

			for(int r = 1; r < vector.length; r++)
				vector[r] -= vector[r - 1];
			
			System.out.printf("Case #%d: %s\n\n", tc, (vector[vector.length - 1] == 0)? "YES" : "NO");
		}
		in.close();
	}
}

/*
6
3 3
-2  2  2
 1  1  0
 2 -2 -2
 
3 3
-1  0  1
 0  2 -1
 0  1  2

3 3
-1 0 1
0  2 -1
-1  1  2

3 3
-1 2 1
-1 -1 -3
1 1 -1

2 3
0 -2 3
1 3 1

2 3
3 1 1
2 0 1


*/
