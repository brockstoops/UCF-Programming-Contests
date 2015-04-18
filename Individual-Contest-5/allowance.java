import java.util.Scanner;


public class allowance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numcases = in.nextInt();
		for(int i =0; i<numcases; i++){
			int highBit = Integer.highestOneBit(in.nextInt()+1);
			int bits = Integer.numberOfTrailingZeros(highBit);
			System.out.println(bits+" "+(highBit-1));
		}
	}

}
