
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
   
	public static void main(String[] args) throws IOException {
		
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		System.out.print(T.solution(input));
		
	}
	
	public String solution(String input) {
		String output = "";
		
		String[] inputArr = input.split(" ");
		int maxLength = Integer.MIN_VALUE;
		
		for(int i=0; i < inputArr.length; i++) {
			/*
			 * 가장 앞쪽에 위치한 것을 찾으려면 <=으로 안하면 될 것임.
			 * */
			if (maxLength < inputArr[i].length()) {
				maxLength = inputArr[i].length();
				output = inputArr[i];
			}
		}
		
		
		return output;
	}
    
}