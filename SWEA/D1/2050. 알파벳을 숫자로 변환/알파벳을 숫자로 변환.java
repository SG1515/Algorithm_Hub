import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine(); //문자열 입력
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)-65+1 + " "); //알파벳 개수만큼 숫자로
		}
		
	}

}
