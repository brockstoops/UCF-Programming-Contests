import java.util.HashMap;
import java.util.Scanner;


public class contractor {
	public static int numOffers;
	public static int[] days;
	public static int[] pay;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for(int i=0; i< num; i++){
			numOffers = in.nextInt();
			int daysWorked = in.nextInt();
			days = new int[numOffers];
			pay = new int[numOffers];
			for(int j=0; j<numOffers; j++){
				days[j] = in.nextInt();
				pay[j] = in.nextInt();
			}
			System.out.println(solve(0,daysWorked, 0));
		}
	}
	public static int solve(int jobs, int daysleft, int money){
		if(jobs == numOffers)
			return money;
		
		int ans = solve(jobs+1, daysleft, money);
		
		if(daysleft >= days[jobs]){
			ans = Math.max(solve(jobs+1, daysleft-days[jobs], money+pay[jobs]), ans);
		}
		
		return ans;
	}

}
