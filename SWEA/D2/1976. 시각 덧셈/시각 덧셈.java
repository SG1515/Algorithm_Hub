import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int T= Integer.parseInt(br.readLine()); // 테스트케이스 
		
		for(int tc=1; tc<=T; tc++) {
	
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int h = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int h2 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());
			
			int hsum = 0;
			int msum = 0;
			
			// 분
			msum = m+m2;
			if(msum>=60) {
				msum -= 60;
				hsum++;
			} 
			
			// 시
			hsum += h+h2;
			if(hsum>=12) {
				hsum -= 12;
			}
			// sb에 저장
			sb.append("#" + tc +' ' + hsum + ' ' + msum + "\n");
		}
		
		System.out.println(sb);
		
		
	}
}