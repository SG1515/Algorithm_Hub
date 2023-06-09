import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	
		int T= Integer.parseInt(br.readLine()); // 테스트케이스 
		
		for(int tc=1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine()); // N개의 숫자열
		
			st = new StringTokenizer(br.readLine()," ");
			
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i=0; i<N; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			// 오름차순 정렬
			Collections.sort(list);
			
			sb.append("#"+tc+" ");
			
			for(int num : list) {
				sb.append(num+" ");
			}
			
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}