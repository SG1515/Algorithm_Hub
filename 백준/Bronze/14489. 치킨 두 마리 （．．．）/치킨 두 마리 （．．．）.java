import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 통장 잔고 A
		int B = sc.nextInt(); // 통장 잔고 B
		int C = sc.nextInt(); // 치킨 한마리 가격 C
		sc.close();

		if (A + B >= (2 * C)) {
			System.out.println((A + B) - (2 * C));
		} else {
			System.out.println(A + B);
		}
        
	}
    
}