import java.util.Scanner;


public class etch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numcases = in.nextInt();
		for(int i=0; i<numcases; i++){
			double f1 = in.nextDouble();
			double f2 = in.nextDouble();
			double a = in.nextDouble();
			double b = in.nextDouble();
			double c = in.nextDouble();
			double time = (f2-f1)/(f1*f2);
			double hi = time/a;
			double lo = 0;
			double ans = 1;
			
			
			while(hi-lo > 0.00001){				
				ans = (hi+lo)/2;
				
				if(solve(a,b,c,ans)<time)
					lo = ans;
				else if(solve(a,b,c,ans) > time)
					hi = ans;
				else{
					//System.out.println("Crystal #"+(i+1)+" "+ans);
					break;
				}
			}
			System.out.print("Crystal #"+(i+1)+": ");
			System.out.printf("%.2f", ans);
			System.out.println();
			System.out.println();
			
		}

	}
	public static double solve(double a, double b, double c, double t){
		return a*t + b*(1-Math.exp(-1*c*t));
	}

}
