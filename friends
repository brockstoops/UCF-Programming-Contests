import java.util.ArrayList;
import java.util.Scanner;


public class friends {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numnetworks = in.nextInt();
		for(int i = 0; i<numnetworks; i++){
			int numpeople = in.nextInt();
			ArrayList<String> names = new ArrayList<String>();
			for(int j=0; j<numpeople; j++)
				names.add(in.next());
			int[][] matrix = new int[numpeople][numpeople];
			for(int j=0; j<numpeople; j++)
				for(int k=0; k<numpeople; k++){
					if(j==k)
						matrix[j][k] = 0;
					else
						matrix[j][k] = 100000;
				}
			int numconnections = in.nextInt();
			for(int j=0; j<numconnections; j++){
				String name1 = in.next();
				String name2 = in.next();
				
				int name1index = names.indexOf(name1);
				int name2index = names.indexOf(name2);
				matrix[name1index][name2index] = 1;
				matrix[name2index][name1index] = 1;
			}
			int [][] distance =  new int[numpeople][numpeople];
			for(int j=0; j<numpeople; j++)
				for(int k=0; k<numpeople; k++)
					distance[j][k] = matrix[j][k];
			
			for(int j=0; j<numpeople; j++)
				for(int k=0; k<numpeople; k++)
					for(int l=0; l<numpeople; l++)
						distance[k][l] = Math.min(distance[k][j]+distance[j][l], distance[k][l]);
			int myindex = names.indexOf("You");
			int myscore = 0;
			for(int j=0; j<numpeople; j++){
				if(matrix[j][myindex]==1)
					myscore++;
				if(distance[j][myindex] > 0 && distance[j][myindex] < 100000)
					myscore++;
			}
			System.out.println("Social Network "+(i+1)+":");
			int numrivals = in.nextInt();
			for(int j=0; j<numrivals; j++){
				String rivalname = in.next();
				int rivalindex = names.indexOf(rivalname);
				int rivalscore = 0;
				if(rivalindex != -1){
					for(int k=0; k<numpeople; k++){
						if(matrix[k][rivalindex]==1)
							rivalscore++;
						if(distance[k][rivalindex] > 0 && distance[k][rivalindex] <100000)
							rivalscore++;
					}
				}
				System.out.println("   "+rivalname+": Difference of "+(myscore-rivalscore)+" point(s).");
			}
			System.out.println();
		}
	}

}
