import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()); //고정비용
		int B = Integer.parseInt(st.nextToken()); //가변비용
		int C = Integer.parseInt(st.nextToken()); //가격
		
		
		if (C <= B ) { // 분모가 음수가 되면 손익분기점 X
			System.out.println(-1);
		} else {
			System.out.println((A/(C-B))+1); // (A / (C-B)) + 1 = n 
		}									// n은 총 비용보다 이익이 큰 판매대수

	}

}