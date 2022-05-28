import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{


		
		int N = Integer.parseInt(br.readLine()); 
		int count = 0;
		
		for (int i=0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);
			
	}
		
		
		
		
	

	public static boolean check() throws IOException { //그룹 단어를 체크할 함수
		boolean[] check = new boolean[26];  //알파벳 검사 초기값이 false이다
		
		int prev = 0; // prev와 해당 문자가 같으면 중복여부 검사 X 다르면 중복여부 검사 O
		
		String str = br.readLine();
		
		
		for(int i=0; i< str.length(); i++) {
			int now = str.charAt(i);
			
			// 앞의 문자와 i번째 문자가 같지 않다면?
			if(prev != now) {
				
				// i번째 문자가 처음 나오는 경우 (false 인 경우)
				if(!check[now - 'a']) { 	// 초기값이 false이기때문
					check[now - 'a'] = true;// true로 변경
					prev = now; 			// 다음 턴을 위해 prev도 바꿔줌
				}
				
				else {// 해당문자가 이미 나온 경우
					return false;
				}
				
			}
		}
		return true;
	
	}


}