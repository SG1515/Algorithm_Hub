import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) { //테스트 케이스
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if (a % 10 == 0) { // a의 나머지가 0이면 10번 컴퓨터 처리됨.
				sb.append(10 + "\n"); // 10번째 컴퓨터 출력 및 줄바꿈
				continue; 
			}
			int num = a % 10; // 나머지만 저장 
			for (int j = 1; j < b; j++) { //b번 반복 
				num = (num * a) % 10; // 나머지에 a를 또 곱하여 나머지
			}
			sb.append(num + "\n"); 
			
			
		}
		
		System.out.print(sb); // 매 테스트 케이스마다 출력을 해야하므로

	}

}
