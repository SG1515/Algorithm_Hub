import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 파일의 갯수
		
		char[] letter = br.readLine().toCharArray(); // 비교 기준 fileName
		
		for (int i = 0; i < N - 1; i++) { // 앞에서 1개의 testcase 소모
			char[] fileName = br.readLine().toCharArray(); // 나머지 입력받기
			for(int j = 0; j < letter.length; j ++) { // 기준과 비교하기 위한 for문
				if(letter[j] != fileName[j]) { //비교
					letter[j] = '?'; // 다르면 ?로 바꾸기
				}
			}
		}
		System.out.println(letter); //output
	}

}