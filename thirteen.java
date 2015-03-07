import java.util.Scanner;


public class thirteen {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String s = in.nextLine();
			solve(s);
		}
	}
	public static void solve(String s){
		String ans = "";
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)>= 'A' && s.charAt(i) <= 'Z'){
				ans += (char)((s.charAt(i)-'A' + 13)%26 + 'A');
			}
			else if(s.charAt(i)>= 'a' && s.charAt(i) <= 'z'){
				ans += (char)((s.charAt(i)-'a' + 13)%26 + 'a');
			}
			else
				ans += s.charAt(i);
		}
		System.out.println(ans);
	}

}
