import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int cross_count = 1; // 해당 범위의 대각선 칸의 갯수
		int prev_count_sum = 0; // 해당 대각선 직전 대각선 까지의 칸의 누적합
		
		while(true) {
				
			
			if (X <= prev_count_sum + cross_count) { // 입력 값이 (직전 대각선 누적값 + 해당 대각선 개수) 보다 작거나 같으면)
				
				
				if(cross_count % 2 == 1) { //대각선의 갯수가 홀수이면
					// 분모가 큰 수부터 시작
					// 분모는 대각선의 갯수 - (X번째 - 직전 대각선까지의 누적합 - 1)
					// 분자는 X번째 - 직전 대각선까지의 누적합)
					System.out.println( (cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum)  );
					break;
				}else {
					System.out.println((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
				
				
				
				
			} else
			{
				prev_count_sum = prev_count_sum + cross_count; // 1..3..5..7..9
				cross_count++;
			}
				
				
		}
			
			
		

	}

}