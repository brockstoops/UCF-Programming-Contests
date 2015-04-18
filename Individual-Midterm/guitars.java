import java.util.Arrays;
import java.util.Scanner;


public class guitars {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numcases = in.nextInt();
		for(int i=0; i<numcases; i++){
			int stores = in.nextInt();
			int routes = in.nextInt();
			int[][] matrix = new int[stores][stores];
			int totalcost = 0;
			for(int j=0; j<stores; j++){
				for(int k=0; k<stores; k++){
					matrix[j][k] = Integer.MAX_VALUE;
				}
			}
			
			for(int j=0; j<routes; j++){
				int store1 = in.nextInt();
				int store2 = in.nextInt();
				int cost = in.nextInt();
				if(cost < matrix[store1-1][store2-1])
					matrix[store1-1][store2-1] = cost;
				if(cost <matrix[store2-1][store1-1])
					matrix[store2-1][store1-1] = cost;
			}
			
			boolean[] used = new boolean[stores];
			int j=0;
			int row = -1;
			int count=0;
			while(count<stores-1){
				int min = Integer.MAX_VALUE;
				for(int k=0; k<stores; k++){
					if(used[k]==false){
						if(matrix[j][k] < min){
							min = matrix[j][k];
							row = k;
						}
					}
				}

				if(min==Integer.MAX_VALUE){
					totalcost=-1;
					break;
				}
				count++;
				used[row] = true;
				int not = 0;
				if(count == stores-1){
					for(int l=0; l<used.length; l++)
						if(used[l]==false){
							not = l;
							//System.out.println("not is "+not);
						}
					min = Integer.MAX_VALUE;
					//System.out.println("not"+not);
					for(int k=0; k<stores; k++){
						if(matrix[not][k] < min){
							min = matrix[not][k];
							row = k;
						}
					}
				}
				//System.out.println("count "+count);
				used[row] = true;
				//System.out.println("min2 "+min);
				totalcost += min;
				j=row;
			}
			System.out.println(totalcost);
		}
	}

}
