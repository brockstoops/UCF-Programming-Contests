import java.util.Scanner;


public class shuffle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numwords = in.nextInt();
		String dummy = in.nextLine();
		while(numwords != 0){
			String[] deck = new String[numwords];
			for(int i=0; i<numwords; i++){
				deck[i] = in.next();
			}
			if(numwords%2 == 0){
				for(int i=0; i<numwords/2; i++){
					System.out.println(deck[i]);
					System.out.println(deck[numwords/2+i]);
				}
			}
			else{
				for(int i=0; i<numwords/2; i++){
					System.out.println(deck[i]);
					System.out.println(deck[numwords/2+1+i]);
				}
				System.out.println(deck[numwords/2]);
			}
			numwords = in.nextInt();
		}
	}

}
