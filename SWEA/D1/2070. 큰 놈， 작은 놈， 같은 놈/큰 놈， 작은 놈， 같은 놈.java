import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
				
		for (int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			
			if (left > right) {
				System.out.println("#" + (i+1) + " " + ">");
			} else if(left < right) {
				System.out.println("#" + (i+1) + " " + "<");
			} else {
				System.out.println("#" + (i+1) + " " + "=");
			}
		}
		br.close();
	}
}
