import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean arr[] = new boolean[31]; //과제 제출자 체크용 배열
		
		for (int i = 0; i < 28; i++) {
			int n = Integer.parseInt(br.readLine()); // 제출한 사람 입력
			arr[n] = true;// 제출한 사람(배열은) true
		}
		
		for (int i = 1; i < 31; i++) {
			if (!arr[i]) { // 번호가 true가 아니면 제출 안함
				System.out.println(i); // 순서대로 출력
			}
		}
		br.close();
		
	}
}