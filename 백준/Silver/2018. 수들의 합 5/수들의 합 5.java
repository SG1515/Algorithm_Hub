import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		int count = 1;
		int start_index =1;
		int end_index =1;
		int sum =1;
		while(end_index !=N) {
			if(sum == N) { // 현재 연속 합이 N과 같은 경우
				count++;
				end_index++;
				sum = sum + end_index;
			}
			
			else if (sum > N) { //현재 연속 합이 N보다 큰경우
				sum = sum - start_index;
				start_index++;
			}
			else { // 현재 연속 합이 N보다 작은 경우
				end_index++;
				sum = sum + end_index;
			}
			
			
			
		}
		System.out.println(count);
		
	}
}
