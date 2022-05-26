import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int subject = Integer.parseInt(br.readLine()); //총 과목 수 
		double total = 0;
		double avg = 0;
		double arr[] = new double[subject];

		
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //과목 점수 입력 
		for (int i=0; i<subject; i++) {
			arr[i] = Integer.parseInt(st.nextToken());	
		}
		
		
		double max = 0;
		for (int i=0; i<subject; i++) {
		
			if(arr[i] > max) // 배열에서 최고점 찾기
				max = arr[i]; 
		}
		
		Arrays.sort(arr);
		
		
		for (int i=0; i<subject; i++) {
			total += ((arr[i] / max) * 100);
		}
		
		avg = total / subject;

		System.out.println(avg);
		

	}
	
}
