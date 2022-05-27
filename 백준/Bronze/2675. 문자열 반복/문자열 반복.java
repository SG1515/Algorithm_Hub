import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;




public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine()); 
		
		for (int i=0; i < T; i++) { // 테스트의 갯수
			//배열로 입력을 받아서 0번은 반복횟수 1번은 문자열을 받는다
			//readLine에 split옵션으로 공백을 기준으로 0,1번으로 생성한다.
			
			
			String[] str = br.readLine().split(" "); //숫자와 문자열 사이를 공백을 기준으로 구분 split()
			
			int R = Integer.parseInt(str[0]); //분리된 문자는 int형으로 변환 
			String S = str[1]; //문자열 S
			
			
			for(int j=0; j < S.length(); j++) { //글자 갯수만큼 루프
				for(int k=0; k < R; k++) { 		//반복횟수만큼 루프 
					System.out.print(S.charAt(j));
				}
			}
			
			System.out.println();
		
		}
		
		
	}

}
