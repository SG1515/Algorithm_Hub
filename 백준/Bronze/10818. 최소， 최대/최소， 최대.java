import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		int Arr[] = new int[N];
		

		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { //N갯수만큼 리턴
			Arr[i] = Integer.parseInt(st.nextToken()); //하나씩 배열에 저장 
		}
		
		int max = Arr[0];
		int min = Arr[0];
		
		for( int i=0; i<N; i++) {
			if(Arr[i] < min) min = Arr[i];
			if(Arr[i] > max) max = Arr[i];
			
		}
		
		bw.write(min + " " + max);
		
		bw.flush();
		bw.close();
		

	}

}
