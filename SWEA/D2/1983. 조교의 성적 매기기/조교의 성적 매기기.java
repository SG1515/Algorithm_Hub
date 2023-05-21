import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Tc = Integer.parseInt(br.readLine());
		String[] garde = {"D0","C-","C0","C+","B-","B0","B+","A-","A0","A+"};
		
		for(int i=0; i<Tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken()); //학생 수
			int K = Integer.parseInt(st.nextToken())-1; //학점을 알고 싶은 학생의 번호
			
			int[] arr = new int[N]; //학생들의 평균을 넣는 배열
			
			
			for(int j=0; j<N; j++) {
				st = new StringTokenizer(br.readLine());
				int midScore = Integer.parseInt(st.nextToken());
				int finalScore = Integer.parseInt(st.nextToken());
				int homework = Integer.parseInt(st.nextToken());
				//총점값이 중요하지 않아서 비율만 하기 위해 단순 곱셈함
				arr[j] = midScore*35 + finalScore*45 + homework*20; 
			}
			
			int score = arr[K]; //K번째 학생의 점수 
			Arrays.sort(arr); //이후 정렬
			int index = -1;
			
			for(int j=0; j<N; j++) {
				if(arr[j] == score) { //score에 담긴 k번째 학생의 점수를 정렬된 배열에서 찾기
					index = j; //K번째 학생의 성적 위치
					break;
				}
			}
			
			int ans = index / (N/10); //N/10명 학생들에게 동일한 평점
			
			System.out.println("#" + (i+1) + " " + garde[ans]);
			
			
		}//end of for(i)
		
	}
}
