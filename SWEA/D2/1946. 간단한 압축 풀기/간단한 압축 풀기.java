import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int T=0; T<tc; T++) {
			int charNum = Integer.parseInt(br.readLine()); //문자의 개수
			char[] c = new char[charNum];
			int[] charCount = new int[charNum];
			
			for(int i=0; i<charNum; i++) { // 입력 받기
				StringTokenizer st = new StringTokenizer(br.readLine());
				c[i] = st.nextToken().charAt(0);
				charCount[i] = Integer.parseInt(st.nextToken());
			}
			System.out.println("#"+(T+1));
			int count = 0;
			int idx = 0;

			while(true) { 
				
				for(int i=0; i<charCount[count]; i++) {
					if(idx == 10) { // 문서의 너비는 10
						System.out.println();
						idx = 0;
					}
					System.out.print(c[count]); 
					idx++;
				}
				
				
				count++;
				if(count >= charNum) break;
			}
			System.out.println();
		} // end of tc
		
	}// end of main
} 