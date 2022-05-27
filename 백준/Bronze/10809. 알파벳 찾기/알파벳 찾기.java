import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[26];
		
		for (int i=0; i < arr.length; i++) { // 1. arr 모두 -1로 초기화
			arr[i] = -1;
		}
		
		String S = br.readLine(); //2. 문자열 받기
		
		for (int i=0; i < S.length(); i++) {
			char ch = S.charAt(i); //3. 입력된 문자열에서 문자 하나하나 ch에 저장 B가 첫번째면 ch = b, i = 0
			
			
			if (arr[ch - 'a'] == -1) { //arr원소 값이 -1인 경우만 
			arr[ch - 'a'] = i; // baekjoon -> arr[1] = 0 
			}
		}
		
		for(int val : arr) { // arr출력
			System.out.print(val + " " );
		}

	}

}