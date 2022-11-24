import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); //첫째 줄 : 숫자 입력
		int a[] = new int[N]; // 배열에 숫자 넣기
		int count = 0; // 갯수 구하기
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) { //둘째 줄 : 배열에 입력되는 숫자 넣기
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		int v = Integer.parseInt(br.readLine());  
		
		for (int i = 0; i < N; i++) { //셋째줄 : v값과 배열의 값 비교하기
			if (a[i] == v) 
				count++;
		}
		bw.write(count + "\n"); //출력
		
		bw.flush();
		br.close();
		bw.close();
			
			
	}
}