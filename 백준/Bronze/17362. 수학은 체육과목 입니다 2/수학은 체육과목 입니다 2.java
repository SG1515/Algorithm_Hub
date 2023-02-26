import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		if (N % 8 == 0) {
			System.out.println(2);
		} else if (N % 4 == 3) {
			System.out.println(3);
		} else if (N % 8 == 6) {
			System.out.println(4);
		} else {
			System.out.println(N % 8);

		}
	}
}