import java.io.*;
import java.util.*;


public class Main {
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		// 무조건 우선 문자열로 저장한다. 형을 변환하려면 StringTokenizer 사용 
		// 그냥 문자열로 저장하려면  Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		// 첫 줄 입력 A는 입력 받을 숫자의 총 갯수 X는 기준이 될 숫자
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		// 다음 줄에 공백을 기준으로 n개의 숫자입력
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < A; i++)
			
		{
			int num = Integer.parseInt(st.nextToken());
			if (num < X) 
			{
				bw.write(num + " ");
			}
			bw.flush();
		}

		bw.flush();
		bw.close();
		
		
		
	}

}

