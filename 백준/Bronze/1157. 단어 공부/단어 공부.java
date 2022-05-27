import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException{		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine(); // 입력
		int[] arr = new int[26]; // 영문자의 갯수
		
		
		for(int i=0; i < s.length(); i++) { //입력만큼 루프
			
			if(65 <= s.charAt(i) && s.charAt(i) <= 90 ) { // 대문자의 범위
				arr[s.charAt(i) - 65]++; //해당 인덱스의 값 1증가
			}
			else { //소문자의 범위
				arr[s.charAt(i) - 97]++; //해당 인덱스의 값 1증가
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i < 26; i++) { //알파벳 배열 루프
			if (arr[i] > max) { // max보다 arr가 크면
				max = arr[i];   //max증가
				ch = (char) (i + 65); //대문자로 출력
				
			} else if(arr[i] == max){ //배열을 다 검사 후 max값과 arr값이 같으면 
				ch = '?';
			}
			
		}
		System.out.println(ch);
	}

}
