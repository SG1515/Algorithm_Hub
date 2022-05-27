import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //숫자의 갯수
		String a = sc.next(); //숫자 N개가 공백없이 주어짐 이때, 입력된 숫자는 문자열로 저장
		sc.close();
		
		
		int sum = 0;

		
		for(int i = 0; i < n; i++) {
			
			sum = sum + a.charAt(i)-'0';
			//입력 받은 문자열의 첫번째 원소 charAt(0) ~ charAt(n)까지 원소의 누적 합 구하기
			//이때 charAt()는 문자의 아스키코드 값을 반환하므로 -48 또는 '0'을 해줘야 함
		}
		
		System.out.println(sum);
	}

}
