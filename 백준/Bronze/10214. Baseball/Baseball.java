import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] korea = new int[9];
		int[] yonsei = new int[9];
		for(int i=0;i<num;i++)
		{
			int yon = 0;
			int kor = 0;
			for(int j=0;j<9;j++)
			{
				yonsei[j] = sc.nextInt();
				yon += yonsei[j];
				korea[j] = sc.nextInt();
				kor += korea[j];
			}
			if(yon > kor)
				System.out.println("Yonsei");
			else if(kor > yon)
				System.out.println("Korea");
			else
				System.out.println("Draw");
		}
			
		
		
		
	}
}