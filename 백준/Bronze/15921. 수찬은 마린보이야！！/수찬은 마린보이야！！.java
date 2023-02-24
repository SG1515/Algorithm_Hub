import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n!=0)
            System.out.println("1.00");
        else
            System.out.println("divide by zero");
    }
}