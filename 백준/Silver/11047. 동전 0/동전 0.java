import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		//동전넣기
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		

		int min = Integer.MAX_VALUE;
		int count =0;
		for(int i=n-1; i>=0; i--) {
			
			if(arr[i] <= money) {
				count += money / arr[i];
				money = money % arr[i];
			}
		}
		System.out.println(count);
	}
}