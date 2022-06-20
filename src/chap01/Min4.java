package chap01;

import java.util.Scanner;

// 네 값의 최솟값을 구하는 min4 method를 작성하세요.
public class Min4 {
	static int min4(int a, int b, int c, int d) {
		int min = a;

		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;

		return min;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("네 정수의 최솟값을 구합니다.");

		System.out.print("a의 값 : ");
		int a = in.nextInt();
		System.out.print("b의 값 : ");
		int b = in.nextInt();
		System.out.print("c의 값 : ");
		int c = in.nextInt();
		System.out.print("d의 값 : ");
		int d = in.nextInt();
		
		int min = min4(a, b, c, d);
		System.out.println("최솟값은 " + min + "입니다.");
		
		in.close();
	}
}
