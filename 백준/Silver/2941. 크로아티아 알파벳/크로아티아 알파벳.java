import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int count = 0;
		int len = S.length();
	
		
		for (int i=0; i < len; i ++) { // 입력받은 값의 끝까지 검사
			
			char ch = S.charAt(i); // 입력받은 데이터를 하나씩 검사하기 위한 변수
			
			
			if (ch == 'c') {
				if (i < S.length() -1 ) { // 중요!! c가 마지막 값일 때 -1 해야함
					if (S.charAt(i + 1) == '=') { //입력받은 문자의 다음이 =이면
						i++; // i+1까지가 하나의 문자이므로 다음 문자로 가기 위해 1증가
					}
					else if (S.charAt(i+1) == '-') { //입력받은 문자의 다음이 -이면
						i++;
					}
				}
			}
			
			if (ch == 'd') {
				if (i < S.length() - 1) { 
					if (S.charAt(i + 1) == 'z') {
							if( i < S.length() - 2) {
		 						if (S.charAt(i + 2) == '=') {
									i += 2;
		 						}
							}	
					}
					else if (S.charAt(i + 1) == '-') {
						i++;
					}
				}
			}
			
			if (ch == 'l') {
				if (i < S.length() - 1) {
					if (S.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
			
			if (ch == 'n') {
				if (i < S.length() -1) {
					if (S.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
			
			if (ch == 's') {
				if (i < S.length() -1 ) {
					if (S.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
			
			if (ch == 'z') {
				if (i < S.length() -1) {
					if (S.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
			
			
			
			count++;
			
		}
		
		System.out.println(count);
	}

}