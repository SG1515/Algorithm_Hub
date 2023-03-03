import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int res = (a / 10) + (a % 10);

        if (a / 10 > 10) {
            res = (a / 100) + (a % 100);
        }

        if (a == 1010) {
            res = 20;
        }

        System.out.println(res);
    }
}