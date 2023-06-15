import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] arr = new double[4];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		double C = Double.parseDouble(st.nextToken());
		double D = Double.parseDouble(st.nextToken());
		
		//처음은 0이고 총 3번까지 돌리니 인덱스 값 3까지 계산한다.
		arr[0] = (A / C) + (B / D);
		arr[1] = (C / D) + (A / B);
		arr[2] = (D / B) + (C / A);
		arr[3] = (B / A) + (D / C);
		
		double max = 0;
		int N = 0;
		
		for(int i = 0; i < 4; i++) {
			if(max < arr[i]) {
				max = arr[i];
				N = i;
			}
		}
		System.out.println(N);
	}

}