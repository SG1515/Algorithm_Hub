import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0; i<T; i++) {
			String s = br.readLine();
			
			for(int j=1; j<=s.length(); j++) {
				String pattern = s.substring(0,j); // SAMSUNG 중 j가 2이라면 SAM까지 
				String tmp = s.substring(j, j+j); // SAM부터 SAMSAM까지 
				
				if (pattern.equals(tmp)) { // j가 6면 parttern=SAMSUNG  tmp(6~12)=SAMSUNG  
 					System.out.printf("#%d %d\n", i+1, pattern.length());
 					break;
				}		
			}
			
		}
	}
}