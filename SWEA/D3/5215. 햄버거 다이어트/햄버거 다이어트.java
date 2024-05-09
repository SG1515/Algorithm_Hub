import java.util.*;
import java.io.*;

class Solution {
	static int[] taste, cal;
	static int maxCal;
	static int base;
	static int max;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int testCase=0; testCase<t; testCase++) { 
			StringTokenizer st = new StringTokenizer(br.readLine());
			base = Integer.parseInt(st.nextToken()); // 재료의 개수
			maxCal = Integer.parseInt(st.nextToken()); // max calorie
			
			taste = new int[base];
			cal = new int[base];
			
			for(int i=0; i<base; i++) {
				st = new StringTokenizer(br.readLine());
				taste[i] = Integer.parseInt(st.nextToken());
				cal[i] = Integer.parseInt(st.nextToken());
			}
			max =0;
			food(0, 0, 0); //인덱스, 칼로리, 맛점수
			
			System.out.print("#" + (testCase+1) + " " + max + "\n");
		}// end of testcase
		
	}// end of main
	
	private static void food(int idx, int sumT, int sumC) {
		
		if (sumC > maxCal) { //제한칼로리보다 더한 칼로리 값이 더 크면
			return;
		} 
		if (idx == base) {
			// 마지막 재료까지 확인했으면(조합으로 포함했든 안했든) DFS에서 빠져나온다
            // 그 전에 지금까지 조합의 칼로리 합이 최대를 넘지 않았으면, max값을 갱신한다.
			if(sumC <= maxCal) { //마지막 taste 값을 더해주기
				max = Math.max(max, sumT);
			}
			return;
		}
		
		//선택 
		food(idx+1, sumT+taste[idx], sumC+cal[idx]);
		food(idx+1, sumT, sumC);
	}
}