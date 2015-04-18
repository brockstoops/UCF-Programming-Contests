import java.util.*;

public class matching 
{
	private static int[][] graph;
	private static boolean[] visited;
	
	public static void main(String[] arguments)
	{
		Scanner scan = new Scanner(System.in);
		
		int cases = scan.nextInt();
		while(cases-->0)
		{
			// Couples
			int c = scan.nextInt();
			visited = new boolean[c];
			graph = new int[c][c];
			scan.nextLine();
			scan.nextLine();
			scan.nextLine();
			
			// Match males
			for(int i = 0; i < c; i++)
				for(int j = 0; j < c; j++)
					graph[i][j] = scan.nextInt();
			// Math females
			for(int i = 0; i < c; i++)
				for(int j = 0; j < c; j++)
					graph[j][i] = Math.min(graph[j][i], scan.nextInt());
			
			
			System.out.println(findMax(0));
		}
		
		scan.close();
	}
	
	
	private static int findMax(int row)
	{
		if(row >= graph.length)
			return 0;
		int max = 0;
		for(int i = 0; i < graph.length; i++)
		{
			if(!visited[i])
			{
				visited[i] = true;
				max = Math.max(max, findMax(row + 1) + graph[row][i]);
				visited[i] = false;
			}
		}
		return max;
	}
}

/**
2
3
4 8 7
6 7 5
5 9 6
7 6 8
6 5 9
4 7 3
2
5 8
9 7
4 8
7 6

2
3
Adam Bob Carl
Diana Ellen Fran
4 8 7
6 7 5
5 9 6
7 6 8
6 5 9
4 7 3
2
Brad Tom
Katie Angelina
5 8
9 7
4 8
7 6


*/
