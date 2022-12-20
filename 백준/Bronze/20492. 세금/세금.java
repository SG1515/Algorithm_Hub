import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        double a = (N - (N*0.22));
        double b = N*0.8 + ((N*0.2)) - ((N*0.2) * 0.22);
        System.out.println((int) a);
        System.out.println((int) b);
    }
}