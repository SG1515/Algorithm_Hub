import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); //구분자 띄어쓰기
			int Max = 0; //테스트 케이스마다 큰 수를 구해야해서 루프안에
			
			for(int j=0; j<10; j++) {
				arr[j] = Integer.parseInt(st.nextToken()); //배열에 각 숫자들 넣기 
				if (arr[j] > Max ) { //Max보다 지금 넣은 값이 클 때, 
					Max = arr[j]; //Max에 담기
				}
			}
			System.out.println("#" + (i+1) + " " + Max);
		}
		
		
		
	}
}
