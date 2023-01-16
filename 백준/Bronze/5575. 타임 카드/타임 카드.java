import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int AH = sc.nextInt(), AM = sc.nextInt(), AS = sc.nextInt();
            int BH = sc.nextInt(), BM = sc.nextInt(), BS = sc.nextInt();


            int start = (AH * 3600) + (AM * 60) + AS;
            int end = (BH * 3600) + (BM * 60) + BS;

            int t = end - start;
            int h = t/3600;
            int m = (t%3600) / 60;
            int s = (t%3600) % 60;

            System.out.println(h + " " + m + " " + s);
        }


    }
}