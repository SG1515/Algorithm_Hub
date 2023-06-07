import java.io.*;
import java.util.*;

public class Solution {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			// input
			int[][] board = new int[9][9];
			
			for (int i = 0; i < 9; i++) {
				st = new StringTokenizer(br.readLine());
				
				for (int j = 0; j < 9; j++) {
					board[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			// solve
			boolean isOkay = true; // 스도쿠가 유효한지 체크하는 변수
			
			// 세로 확인
			for (int i = 0; i < 9; i++) {
				int[] check = new int[10];
				
				for (int j = 0; j < 9; j++) {
					check[board[i][j]] = 1;
				}
				
				for (int j = 1; j <= 9; j++) {
					if (check[j] != 1) {
						isOkay = false;
						break;
					}
				}
			}
			
			// 세로 확인 후, isOkay가 false로 바꼈다면, 0을 출력하고 다음 테스트케이스로 넘긴다.
			if (!isOkay) {
				bw.write("#" + tc + " " + 0 + "\n");
				continue;
			}
			
			// 가로 확인
			for (int j = 0; j < 9; j++) {
				int[] check = new int[10];
				
				for (int i = 0; i < 9; i++) {
					check[board[i][j]] = 1;
				}
				
				for (int i = 1; i <= 9; i++) {
					if (check[i] != 1) {
						isOkay = false;
						break;
					}
				}
			}

			// 가로 확인 후, isOkay가 false로 바꼈다면, 0을 출력하고 다음 테스트케이스로 넘긴다.
			if (!isOkay) {
				bw.write("#" + tc + " " + 0 + "\n");
				continue;
			}
			
			// 3 x 3 체크
			for (int i = 0; i < 9; i += 3) {
				for (int j = 0; j < 9; j += 3) {
					int[] check = new int[10];
					
					for (int w = i; w < i + 3; w++) {
						for (int h = j; h < j + 3; h++) {
							check[board[w][h]] = 1;
						}
					}
					
					for (int k = 1; k <= 9; k++) {
						if (check[k] != 1) {
							isOkay = false;
							break;
						}
					}
				}
			}
			
			// 3 x 3 확인 후, isOkay가 false로 바꼈다면, 0을 출력하고 다음 테스트케이스로 넘긴다.
			if (!isOkay) {
				bw.write("#" + tc + " " + 0 + "\n");
			}
			else { // 유효할 경우, 1 출력
				bw.write("#" + tc + " " + 1 + "\n");
			}
		}

		bw.flush();
		bw.close();
	}

}