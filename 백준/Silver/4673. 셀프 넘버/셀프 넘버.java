//self number
public class Main {

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001]; //1~ 10000까지이므로
		
		
		for (int i = 1; i < 10001; i++) { // 1~10001까지 검사
			int n = d(i); // n은 d(n) 생성자
			
			if (n < 10001) { //10000넘는 수 X
				check[n] = true;
			}	
		}
		
		for (int i = 1; i< 10001; i++) {
			if (!check[i]) {
				System.out.print(i + "\n");
			}
		}
		
	}
	
	
	
	public static int d(int number) { //return-> number생성자 d
		
		int sum = number; // 연산 전 숫자 저장
		
		while(number != 0) {
			sum = sum + (number % 10); //첫째 자리수
			number = number/10; // 10을 나누어 한자리씩 줄인다
			
		}
		
		return sum;
	}

}
