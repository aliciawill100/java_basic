package 복습;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값을 입력하세요.");
		int a = sc.nextInt();
		System.out.println("종료값을 입력하세요.");
		int b = sc.nextInt();
		System.out.println("점프값을 입력하세요.");
		int c = sc.nextInt();

		int sum1 = 0;
		for (int i = a; i < b; i++) {
			sum1 = sum1 + c + a;
			if (sum1 < 100) {
				System.out.println("점프 값을 포함한 더한 값은" + sum1 + "입니다.");
				continue;
			} else {
				System.out.println("더한 값이 100을 넘었으므로 프로그램을 종료합니다.");
				break;
			}
		}
		sc.close();
	}
}
