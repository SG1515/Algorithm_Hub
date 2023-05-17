import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[] arr = new int[10];
		
		for(int i=0; i<T; i++) { //테스트 케이스만큼 루프
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			double avg = 0;
			int sum = 0;
			
			
			for(int j=0; j<10; j++) {
				int num = Integer.parseInt(st.nextToken());
				arr[i] += num;
			}
			
			sum = arr[i];
			avg = (double) sum /10;
			
			System.out.println("#" + (i+1) + " " + Math.round(avg));
		}
		br.close();
	}

}


