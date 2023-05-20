import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {

			String s = br.readLine(); //문자 입력받기			
			
			StringBuffer sb = new StringBuffer(s);
			String reverse = sb.reverse().toString();
			
			if (s.equals(reverse)) { //비교 
				System.out.printf("#%d 1\n",i+1);
			} else {
				System.out.printf("#%d 0\n",i+1);
			}
			
		} // end of for(i)
		
		
		
	}
}