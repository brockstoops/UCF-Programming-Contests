import java.util.Scanner;


public class puzzle {

	public static void main(String[] args) {
		Scanner in  =  new Scanner(System.in);
		while(in.hasNext()){
			int[][] board = new int[4][4];
			int row = 0;
			int col = 0;
			for(int i=0; i<4; i++)
				for(int j=0; j<4; j++){
					board[i][j] = in.nextInt();
					if(board[i][j] == 0){
						row = i;
						col = j;
					}
				}
			int numMoves = in.nextInt();
			String[] moves = new String[numMoves];
			for(int i=0; i<numMoves; i++){
				String move = in.next();
				if(move.charAt(0) == 'D'){
					int changeNum = board[row+1][col];
					board[row+1][col] = 0;
					board[row][col] = changeNum;
					row = row+1;
				}
				else if(move.charAt(0) == 'U'){
					int changeNum = board[row-1][col];
					board[row-1][col] = 0;
					board[row][col] = changeNum;
					row = row-1;
				}
				else if(move.charAt(0) == 'R'){
					int changeNum = board[row][col+1];
					board[row][col+1] = 0;
					board[row][col] = changeNum;
					col = col+1;
				}
				else if(move.charAt(0) == 'L'){
					int changeNum = board[row][col-1];
					board[row][col-1] = 0;
					board[row][col] = changeNum;
					col = col-1;
				}	
			}
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					if(board[i][j] != 0)
						System.out.printf("%2d ",board[i][j]);
					else
						System.out.print("   ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}

/*
15 6 14 13
5 0 11 9
3 10 1 12
7 4 2 8
2
D
R
1 2 3 4
5 6 7 8
10 0 12 11
9 13 14 15
3
R
U
L


*/
