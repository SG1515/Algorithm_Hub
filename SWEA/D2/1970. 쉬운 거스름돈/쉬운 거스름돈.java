import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		int[] change = {50_000, 10_000, 5_000, 1_000, 500, 100, 50, 10}; // length 8
 		
		
		for (int i=0; i<tc; i++) {
			int N = Integer.parseInt(br.readLine());
			int count = 0; // 거스름돈 갯수
			int divN = N; // 현재 금액
			int agoN = 0; 
			System.out.printf("#%d\n", (i+1));
			
			for (int j=0; j<change.length; j++) {
				if(change[j] == 50_000) {
					count = N / change[j]; // 현재 거스름돈 
					divN = N - (change[j] * count); // 현재 남은돈 
					System.out.printf("%d ", count); // 거스름돈 출력
					count = 0; // 초기화
				} else 
				{
					agoN = divN;
					count = agoN / change[j]; // 5만원 이후 거스름돈 갯수
					divN = agoN - (change[j]*count); // 거스름돈
					System.out.printf("%d ", count); // 거스름돈 출력
					count = 0;
				}
			} 
			
			
			System.out.println();

		} // end of testcase
	} // end of main
}