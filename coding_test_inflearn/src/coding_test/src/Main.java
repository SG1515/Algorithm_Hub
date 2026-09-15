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
		String result = "YES";
		StringBuilder sb = new StringBuilder();
		
		str = str.toUpperCase();
		char[] strArr = str.toCharArray();
		for (char x : strArr) {
			if(x >= 65 && x <= 122) {
				sb.append(x);
			}
		}
		
		String s = sb.toString();
		String reverseS = sb.reverse().toString();
//		System.out.println("s : " + s);
//		System.out.println("r : " + reverseS);
		if(!s.equals(reverseS)) {
			return result = "NO";
		}
		
		
		return result;
	}

	
}