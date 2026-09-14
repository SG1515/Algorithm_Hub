

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
   

	public static void main(String[] args) throws IOException{
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.solution(str));

    }
	
	
	public String solution(String str) {
		
		if (str.length() <= 0) return "문자열을 입력해 주세요.";
		
		StringBuilder sb = new StringBuilder();
		char[] strSplit = str.toCharArray();
		
		for(char c : strSplit) {
			int castC = (int) c;
			if( castC >= 65 && castC <= 90) sb.append((c + "").toLowerCase());
			if( castC >= 97 && castC <= 122) sb.append((c + "").toUpperCase());
		}
		
		
		return sb.toString();
		
	}
    
}