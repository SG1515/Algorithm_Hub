import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int quo = 0; //몫
			int rem = 0; //나머지
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int tmp = Integer.parseInt(st.nextToken());
			
			quo = num / tmp;
			rem = num % tmp;
			
			
			System.out.printf("#%d %d %d\n",(i+1),quo,rem);
		}

	}

}
