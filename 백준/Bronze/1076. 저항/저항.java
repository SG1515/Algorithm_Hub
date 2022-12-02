import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = ""; //첫번째 값과 두번째 값
		long N = 0; //최종값 저장
		
		for (int i = 0; i < 3; i++) { // A에 문자열 입력받기
			String register = br.readLine();
			
			
			//입력된 값을 case문으로 나눠서 판단 
			//1, 2, 3 연산 방식이 다르므로 조건문으로 분리한다.
			switch(register) {
			case "black":
				if(i == 2) {
					N *= 1; //
				} else {
					S += "0";
				} break;
				
			case "brown":
				if(i == 2) {
					N *= 10; //
				} else {
					S += "1";
				} break;
				
			case "red":
				if(i == 2) {
					N *= 100; //
				} else {
					S += "2";
				} break;
			
			case "orange":
				if(i == 2) {
					N *= 1000; //
				} else {
					S += "3";
				} break;
				
			case "yellow":
				if(i == 2) {
					N *= 10000; //
				} else {
					S += "4";
				} break;
				
			case "green":
				if(i == 2) {
					N *= 100000; //
				} else {
					S += "5";
				} break;
				
			case "blue":
				if(i == 2) {
					N *= 1000000; //
				} else {
					S += "6";
				} break;

			case "violet":
				if(i == 2) {
					N *= 10000000; //
				} else {
					S += "7";
				} break;
				
			case "grey":
				if(i == 2) {
					N *= 100000000; //
				} else {
					S += "8";
				} break;
				
			case "white":
				if(i == 2) {
					N *= 1000000000; //
				} else {
					S += "9";
				} break;
			}
			//두번째 값까지 연산이 되었다면 형변환해서 저장
			if(i == 1) {
				N = Long.parseLong(S);
			}
		}
		System.out.println(N);
	}
}