
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
				
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int ymd = Integer.parseInt(st.nextToken());
			
			int year = ymd / 10000;
			int month =  (ymd-year*10000)/100; // (22220228-22220000)=0228 0228/100 =02
			int day = ymd % 100; //날짜니까 2번째자리까지 추출 
			
			if( (month > 12 || month < 1) || (day<1 || day > arr[month-1])) { 
				System.out.printf("#%d -1\n", i+1);
			} else {
				System.out.printf("#%d %04d/%02d/%02d\n",i+1,year,month,day);	
			}
			
		}
		br.close();
		
	}

}
