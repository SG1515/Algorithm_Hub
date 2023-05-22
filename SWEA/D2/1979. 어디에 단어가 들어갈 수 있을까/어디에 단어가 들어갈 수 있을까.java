import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int T = Integer.parseInt(br.readLine());
			// 테스트케이스 반복
			
			for (int i = 1; i <= T; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				// 바둑판 크기
				int N = Integer.parseInt(st.nextToken());
				// 단어 크기
				int K = Integer.parseInt(st.nextToken());
				String[] numStr = new String[N];
				// 값 입력하기
				for (int x = 0; x < N; x++) {
					numStr[x] = br.readLine();
				}

				System.out.println("#" + i + " " + count(numStr,N,K));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int count(String[] numStr, int N, int K) {
		int count = 0;
		//x축으로 이동했을때 찾은 공간
		int xWordCount=0;
		//y축으로 이동했을때 찾은 공간
		int yWordCount=0;
		//x축 검색
		for (int i = 0; i < N; i++) {
			xWordCount=0;
			//입력받은 값중 빈공간도 모두 받았기에 2씩 움직임
			for (int j = 0; j < N*2; j+=2) {
				//1인지 확인
				if (numStr[i].charAt(j)=='1') {
					xWordCount++;
				}
				//0이 이면서 xWordCount가 K가 아닌경우 ex) 11001
				else if(numStr[i].charAt(j)=='0'&&xWordCount!=K) {
					xWordCount=0;
				}
				//0이 이면서 xWordCount가 K값과 같은경우 ex) 1110111
				else if(numStr[i].charAt(j)=='0'&&xWordCount==K) {
					count++;
					xWordCount=0;
				}
			}
			//연속으로 K만큼만 있었다는 뜻
			if(xWordCount==K) {
					count++;
			}
		}
		//y축 검색
		for (int i = 0; i < N*2; i+=2) {
			yWordCount=0;
			for (int j = 0; j < N; j++) {
				//1인지 확인
				if (numStr[j].charAt(i) == '1') {
					yWordCount++;
				}
				else if(numStr[j].charAt(i) == '0'&&yWordCount!=K){
					yWordCount=0;
				}
				else if(numStr[j].charAt(i) == '0'&&yWordCount==K){
					yWordCount=0;
					count++;
				}
			}
			//연속으로 K만큼만 있었다는 뜻
			if(yWordCount==K) {
					count++;
			}
		}
		return count;
	}
}
