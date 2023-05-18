import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		System.out.printf("1 ");
		int square = 1;
		
		for(int i=0; i<T; i++) {
			square *= 2;
			System.out.printf("%d ",square);
			
		}
		
	}
}
