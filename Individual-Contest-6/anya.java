import java.util.Scanner;


public class anya {
	public static void main(String[] args) {
		String sentence = "";
		Scanner in = new Scanner(System.in);
		int numcases = in.nextInt();
		String dummy = in.nextLine();
		for(int i=0; i<numcases; i++){
			sentence = in.nextLine();
			int count = 0;
			String [] words = sentence.split(" ");
			for(int j=0; j<words.length; j++){
				if(words[j].length() > 2){
					for(int k=0; k<words[j].length()/2; k++){
						if(words[j].charAt(k) != words[j].charAt(words[j].length()-1-k)){
							break;
						}
						if(k==words[j].length()/2-1)
							count++;
					}
				}
			}
			if(count>1)
				System.out.println("Ay");
			else{
				sentence = sentence.replaceAll(" ", "");
				for(int j=0; j<sentence.length()/2; j++){
					if(sentence.charAt(j) != sentence.charAt(sentence.length()-1-j)){
						System.out.println("Nap");
						break;
					}
					if(j==sentence.length()/2-1)
						System.out.println("Ay");
				}
				
			}
		}
	}

}
