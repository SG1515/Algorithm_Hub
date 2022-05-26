import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int copy = N;
		int count = 0;
		
		do {
			N =    ((N % 10) * 10)  +  (((N/10) + (N % 10)) % 10); // 십의자리 + 일의자리
			count++; //몇번 수행했는지 세기 
			
		} while(copy != N);
		
		
		System.out.println(count);
		
		
		
	}

}
