public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int a = 2; a <= 100; a++) {
			for(int b = 2; b <= a; b++) {
				for(int c = b; c <= a; c++) {
					for(int d = c; d <= a; d++) {
						if(a*a*a == b*b*b + c*c*c + d*d*d) {
							sb.append("Cube = ").append(a).append(", Triple = (").append(b);
							sb.append(",").append(c).append(",").append(d).append(")").append("\n");
						}
					}
				}
			}
		}
		System.out.println(sb);
	}

}