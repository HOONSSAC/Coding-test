import java.util.Scanner;

public class Baekjoon_2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int prize = 0;
		
		if (a == b || b == c || a == c) {
			if (a == b && b == c) {
				prize = 10000 + a * 1000;
			}
			else if (a == b && b != c) {
				prize = 1000 + a * 100;
			}
			else if (b == c && b != a) {
				prize = 1000 + b * 100;
			}
			else {
				prize = 1000 + a * 100;
			}
		}
		else {
			int temp = Math.max(a, b);
			prize = Math.max(temp, c) * 100;
		}
		
		System.out.println(	prize);
		
		sc.close();
	}
}
