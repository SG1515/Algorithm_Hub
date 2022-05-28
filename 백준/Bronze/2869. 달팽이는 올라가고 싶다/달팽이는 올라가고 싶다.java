import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 미터
		int B = Integer.parseInt(st.nextToken()); // 밤에 떨어지는 미터
		int V = Integer.parseInt(st.nextToken()); // 총 미터
		
		int day = (V - B) / (A - B); // (총미터 - 떨어지는) / (올라가는 - 떨어지는);
		//잔여 블록으로 인해 총 높이에서 떨어지는 값을 빼주어야 최소한의 값이 나온다.
		
		if ((V - B) % (A - B) != 0) { //올라가야할 높이에서 매일 올라가는 높이를 나눴을 때 나머지가 0이 아니면 
			day++; // 하루 더 올라가야한다
		}
		System.out.println(day);
		

	}

}
