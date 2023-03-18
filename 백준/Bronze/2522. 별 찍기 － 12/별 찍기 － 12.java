import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int star;
    static int space;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        space=N-1;
        star=0;
        for(int i=0;i<(2*N-1);i++){
            if(i<N) {
                printSpace(--space);
                printStar(star++);
            }else if(i==N){
                star-=1;
                printSpace(++space);
                printStar(--star);
            }else{
                printSpace(++space);
                printStar(--star);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void printSpace(int space){
        for(int i=0;i<=space;i++){
            sb.append(" ");
        }
    }
    public static void printStar(int star){
        for(int i=0;i<=star;i++){
            sb.append("*");
        }
    }

}