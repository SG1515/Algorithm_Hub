import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
		
    public static void main(String[] args) throws Exception{
    	
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T =  Integer.parseInt(br.readLine()); 
		ArrayList<Integer> arr = new ArrayList<>(); 
		int ans = 0;
		
		int cal[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		
		for(int tc=0; tc<T; tc++) {   
    		
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int m1 = Integer.parseInt(st.nextToken()); // 첫 번째 일자의 월
			int d1 = Integer.parseInt(st.nextToken()); // 첫 번째 일자의 일
			int m2 = Integer.parseInt(st.nextToken()); // 두 번째 일자의 월
			int d2 = Integer.parseInt(st.nextToken()); // 두 번째 일자의 일
			
		
			if(m1==m2) ans = d2-d1 + 1;

			else {
				ans = ( cal[m1] - d1 ) + d2;
				for(int i=m1+1; i<m2; i++) {
					ans += cal[i];
				}
				ans += 1;
			}
			arr.add(ans);
		
		}
	
			
		for(int i=1; i<=T; i++) {
			System.out.println("#" + i + " " + arr.get(i-1));
		}
	
	}// end of main
}