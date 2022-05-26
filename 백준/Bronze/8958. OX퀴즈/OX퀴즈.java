import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		
		int N = Integer.parseInt(br.readLine()); // 테스트 케이스가 몇개
		String arr[] = new String[N]; //테스트 케이스 갯수만큼 String으로 배열 생성
		
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine(); // 각 배열 칸마다 문자열 저장
			
		}

		for (int i = 0; i < N; i++) { //각 배열마다 계산
			
			int count = 0; //합산 값을 계산하기 위해 생성
			int sum = 0; //표시할 합산값
			
				for (int j = 0; j < arr[i].length(); j++) { //이 부분이 중요하다 계산할 입력값의 길이만큼 루프
				
					if (arr[i].charAt(j) == 'O') { // arr[0]번에 j번째 있는 문자열이 O일 경우
						count++; //증가
					} else {
						count = 0; // X를 만나면 점수가 초기화 되므로 0
					}
					sum = sum + count;
				}
			
				System.out.print(sum + "\n"); // 계산된 값은 출력 후 다음 배열로 이동
			
			
		}
		
		
	}

}