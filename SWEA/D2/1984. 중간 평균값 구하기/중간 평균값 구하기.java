import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Tc = Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		
		for (int i=0; i<Tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<arr.length; j++) { //배열에 숫자 채워넣기
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			//배열의 숫자 중에 가장 큰 수와 작은 수 찾기
			int max = arr[0];
			int min = arr[0];
			for (int j=0; j<arr.length; j++) {
				if (max < arr[j]) max = arr[j];
				if (min > arr[j]) min = arr[j];
			}
			
			// 평균 구하기
			double avg = 0;
			int sum = 0;
			for (int j=0; j<arr.length; j++) {
				sum += arr[j];
				avg = (double) (sum - max - min) /8;
			}
			System.out.printf("#%d %d\n", i+1,(int) Math.round(avg));
			
			
		} //end of for(i)
		
	}

}