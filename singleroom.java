import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class singleroom {
	
	public static ArrayList<Integer> start;
	public static ArrayList<Integer> endtime;
	public static HashMap<Integer, Integer> end;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for(int i=0; i<num; i++){
			int events = in.nextInt();
			start = new ArrayList<Integer>();
			endtime = new ArrayList<Integer>();
			end = new HashMap<Integer, Integer>();
			for(int j=0; j<events; j++){
				start.add(in.nextInt());
				endtime.add(in.nextInt());
				if(end.containsKey(endtime.get(j))){
					if(end.get(endtime.get(j)) < start.get(j))
						end.put(endtime.get(j),start.get(j));
				}
				else{
					end.put(endtime.get(j),start.get(j));
				}
			}
			Collections.sort(endtime);
			int time =0;
			int numevents = 0;
			for(int j=0; j<events; j++){
				if(end.get(endtime.get(j))>=time){
					numevents++;
					time = endtime.get(j);
				}
			}
			System.out.println("Test case "+(i+1)+": A maximum of "+numevents+" events can be scheduled.");
		}
	}
	public static int solve(int index, int numEvents, int currTime){
		if(index == start.size())
			return numEvents;
		
		int ans = solve(index+1, numEvents, currTime);
		
		if(currTime <= end.get(endtime.get(index)))
			ans = Math.max(solve(index+1, numEvents+1, end.get(endtime.get(index))), ans);
		
		return ans;
	}

}
