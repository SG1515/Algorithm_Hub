import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()); // 입력 String을 token단위로 끊어줌 문자열을 분리
			int A = Integer.parseInt(st.nextToken()); //문자열 -> int형으로 형변환
	   		int B = Integer.parseInt(st.nextToken());
			
	   		if (A==0 && B==0) //입력값 A와 B가 모두 0일 때
	   		{
	   			break;
	   		}
	   		
	   		bw.write((A+B) + "\n");
	   		
		}
		bw.flush();
		bw.close();
	}

}
