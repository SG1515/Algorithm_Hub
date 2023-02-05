import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        int result=0;
        int[] num = new int[3];

        for(int i=0;i<num.length;i++){
            num[i]=scanner.nextInt();
        }

        for(int i=0;i<num.length;i++){
            if(num[i]<=n){
                result=result+num[i];
            }else{
                result=result+n;
            }
        }

        System.out.println(result);
    }
}