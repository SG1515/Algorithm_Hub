import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));
		
		
	}

	
	public static int arithmetic_sequence(int num) {
		int cnt = 0;
		
		if (num < 100) { // 1~99까지는 그 자체가 수열이다
			
			return num;
		
		} else { //100 ~ 
			cnt = 99; // 100이 넘으면 일단 수열이 99개 이상이다
			
			for(int i = 100; i<= num; i++) {
				int hun = i / 100; //백자리
				int ten = (i / 10) % 10; //십자리
				int one = i % 10; //일자리 
				
				if((hun - ten) == (ten - one)) {
					cnt++;
				}
			}	
		}
		
		return cnt;
		
	}
}
