

import java.io.IOException;
import java.util.Scanner;

public class Main {
   
	public int solution(String str, char c) {
		int result = 0;
		
		char[] strArr = str.toUpperCase().toCharArray();
		c = Character.toUpperCase(c);
		
		for(char x : strArr) {
			if(x == c) result++; 
		}
		
		return result;
	}
	
	public static void main(String[] args) throws IOException{
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        
        String str = kb.next();
        char c = kb.next().charAt(0);        
        
        System.out.println(T.solution(str, c));
    }

    
}