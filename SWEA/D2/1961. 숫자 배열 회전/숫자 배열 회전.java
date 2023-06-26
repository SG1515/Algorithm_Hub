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
				int N = Integer.parseInt(br.readLine());
				String[] str = new String[N];
				StringBuilder sb = new StringBuilder();
				for (int n = 0; n < N; n++) {
					StringTokenizer st = new StringTokenizer(br.readLine()," ");
					String temp="";
					//입력된 문자 공백제거 후 합치기
					while (st.hasMoreTokens()) {
						temp=temp+st.nextToken();
					}
					str[n]=temp;
				}
				for (int n = 0; n < N; n++) {
					sb.append(up(str, n,N) + " ");
					sb.append(left(str, n,N) + " ");
					sb.append(down(str, n,N) + "\n");
				}
				System.out.println("#" + i);
				System.out.print(sb.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 아래에서 위로방향
	private static String up(String[] str, int n,int N) {
		StringBuilder sb = new StringBuilder();
		for(int i=N-1;i>=0;i--) {
			sb.append(str[i].charAt(n));
		}
		return sb.toString();
	}

	// 오른쪽에서 왼쪽으로
	private static String left(String[] str, int n,int N) {
		StringBuilder sb = new StringBuilder();
		for(int i=N-1;i>=0;i--) {
			sb.append(str[N-n-1].charAt(i)) ;
		}
		return sb.toString();
	}

	// 위에서 아래방향
	private static String down(String[] str, int n,int N) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append(str[i].charAt(N-n-1));
		}
		return sb.toString();
	}

}