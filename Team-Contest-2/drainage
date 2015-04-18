import java.util.*;

public class drainage 
{
	private static int[][] graph, rgraph;
	private static int[] prev;
	private static int src, dst;
	
	public static void main(String[] arguments)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		src = 0;
		dst = m-1;
		
		graph = new int[m][m];
		rgraph = new int[m][m];
		
		for(int i = 0; i < n; i++)
		{
			int u = scan.nextInt()-1, v = scan.nextInt()-1, flo = scan.nextInt();
			graph[u][v] = rgraph[u][v] = flo;
		}
		
		fordFolk();
		
		scan.close();
	}
	
	private static void fordFolk()
	{
		rgraph = new int[graph.length][graph.length];
		for(int i = 0; i < graph.length; i++)
			for(int j = 0; j < graph.length; j++)
				rgraph[i][j] = graph[i][j];
		
		int u, v, maxFlow = 0, bneck = (int)10e9;
		while(bfs())
		{
			for(u = dst; u != src; u = prev[u])
			{
				v = prev[u];
				bneck = Math.min(bneck, rgraph[v][u]);
			}
			
			for(u = dst; u != src; u = prev[u])
			{
				v = prev[u];
				rgraph[v][u] -= bneck;
				rgraph[u][v] += bneck;
			}
			
			maxFlow += bneck;
			prev = new int[graph.length];
		}
		
		System.out.println(maxFlow);
	}
	
	
	private static boolean bfs()
	{
		prev = new int[graph.length];
		Arrays.fill(prev, -1);
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(src);
		prev[src] = src;
		while(!q.isEmpty())
		{
			int vert = q.poll();
			if(vert == dst)
				return true;
			for(int i = 0; i < graph.length; i++)
			{
				if(rgraph[vert][i] > 0 && prev[i] == -1)
				{
					q.add(i);
					prev[i] = vert;
				}
			}
		}
		return false;
	}
}
/**
5 4
1 2 40
1 4 20
2 4 20
2 3 30
3 4 10

*/
