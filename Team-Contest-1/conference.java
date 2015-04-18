import java.util.*;


public class conference 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for(int tc = 1; tc <= testCases; tc++)
		{
			int[] events = new int[31];
			int numEvents = in.nextInt();
			for(int i = 0; i < numEvents; i++)
				events[in.nextInt()] = in.nextInt();
			int sum = 0;
			for(int i = 0; i < events.length; i++)
				if(events[i] != 0)
				{
					for(int j = i; i < j + events[j]; i++)
						sum |= 1 << (29 - i);
					i--;
				}
			System.out.println(sum);
		}
		in.close();
	}
}

/*
4
1
15 1
2
0 30
5 25
2
0 1
1 29
2
20 2
25 2

*/
