import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), w=sc.nextInt(), h=sc.nextInt(), l=sc.nextInt();
        int ans = (w / l) * (h / l);
        System.out.println(Math.min(n, ans));
    }
}