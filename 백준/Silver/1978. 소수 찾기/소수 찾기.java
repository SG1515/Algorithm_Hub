import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
		
		int T = Integer.parseInt(br.readLine());
		int count = 0;
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < T; i++) {
		
			
			int num = Integer.parseInt(st.nextToken());
			
			if(isPrime(num) == true) { count++; }
			
	
			
		}
		System.out.println(count);

	}

	
	
	public static boolean isPrime(int num) {
		
		if(num == 1) {
			return false; // 1은 소수가 아니다.
		}
		
		//2~ num -1 까지 중 나누어 떨어지는 약수가 있는지 판별한다.
		// num = 2 의 경우는 자연스럽게 for문을 검사하지 않게 됨
		
		
		for(int i = 2; i < num; i++) {
			
			if (num % i == 0) //나누어 떨어지는 수가 있으면  
				return false; //false
		}
		
		return true;
		
		
		
	}
		

}
