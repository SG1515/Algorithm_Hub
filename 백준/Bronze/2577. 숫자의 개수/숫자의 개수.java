import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[10]; // 각 비교할 숫자를 추출하기 위해 사용할 것임
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		while(val != 0) {
			arr[val%10]++; //곱한 값에 10으로 나눈 나머지 = 비교할 숫자
			val = val / 10; //계산 결과 값을 10씩 나눠서 한 자리씩 줄임
		}
		
		
		for(int i : arr) { //arr배열에 있는 요소들을 하나씩 출력
			System.out.println(i);
		}
		br.close();
	
	}

}