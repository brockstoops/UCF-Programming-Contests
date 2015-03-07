import java.io.*;
import java.util.*;

public class genetics
{
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        for(int i =0; i<num; i++){
        	String s = in.next();
        	if(s.charAt(0) < 'A')
        		convertTo4(s, i+1);
        	else
        		convertTo10(s, i+1);
        }
    }
    
    public static void convertTo4(String word, int n){
    	String ans = Integer.toString(Integer.parseInt(word),4);
    	System.out.print("Sequence #"+n+": ");
    	for(int i=0; i<ans.length(); i++){
    		if(ans.charAt(i) == '0')
    			System.out.print('A');
    		else if(ans.charAt(i) == '1')
    			System.out.print('C');
    		else if(ans.charAt(i) == '2')
    			System.out.print('G');
    		else
    			System.out.print('T');
    	}
    	System.out.println();
    }
    public static void convertTo10(String word, int n){
    	String ans = "";
    	for(int i=0; i<word.length(); i++){
    		if(word.charAt(i) == 'A')
    			ans += '0';
    		else if(word.charAt(i) == 'C')
    			ans += '1';
    		else if(word.charAt(i) == 'G')
    			ans+= '2';
    		else
    			ans+= '3';
    	}
    	System.out.println("Sequence #"+n+": "+Integer.valueOf(ans, 4));
    }
}
