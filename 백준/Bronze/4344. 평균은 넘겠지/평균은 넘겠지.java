import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_Case = Integer.parseInt(br.readLine());
		int arr[];
		
		
		
		for(int i = 0; i < test_Case; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); //학생 수 N 및 성적 입력 꼭 루프 안에 있어야함 매 줄마다 사용
			int N = Integer.parseInt(st.nextToken());
			arr = new int[N]; //배열에 학생 수 입력
			
			double sum = 0; //누적성적
			
			// 성적 입력
			for(int j=0; j < N; j++) {
				int val = Integer.parseInt(st.nextToken()); // 성적 입력
				arr[j] = val; // j마다 val 저장
				sum += val; // 성적 누적 
				
			}
			
			double avg = (sum / N); //평균값 
			double count = 0;
			
			// 평균 이상 학생 찾기
			for(int j=0; j < N; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			
			
			System.out.printf("%.3f%%\n",(count/N)*100); // %는 단독으로 출력 불가능 두개써야함
			
		}
		
	}

}