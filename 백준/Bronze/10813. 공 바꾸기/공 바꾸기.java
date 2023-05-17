import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 바구니 갯수
		int M = Integer.parseInt(st.nextToken()); // 몇번 바꿀지
		
		int[] arr = new int[N];
		
		for (int i=0; i < arr.length; i++) {  // 바구니에 숫자 넣기
			arr[i] = i+1; //1부터 ~ N
		}
		
		for(int z=0; z < M; z++) {
			int tmp;
			st = new StringTokenizer(br.readLine()); //줄바꿈
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			tmp = arr[i-1]; //배열은 0부터 i-1 
			arr[i-1] = arr[j-1];
			arr[j-1] = tmp;
		}
		br.close();
		for(int basket : arr){
			System.out.print(basket + " ");
		}
	}

}