import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 9;
		int arr[] = new int[n];
		int index = 0;
		int max = 0;
		int count = 0;
		
		
		
		for (int i = 0; i < n; i++) { //9번 입력 받기
			StringTokenizer st = new StringTokenizer(br.readLine());
			int number = Integer.parseInt(st.nextToken());
			
			arr[i] = number; //입력된 수를 배열에 저장
		}
		
		
		for (int value : arr) { //중요  ----- for문 활용 arr에 배열 값을 하나 하나 value에 저장하여 루프
			count++; 
			
			if (value > max) {
				max = value; //최대값 찾기
				index = count; // 사실 count를 출력해도 된다.
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}

}
