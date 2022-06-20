package chap01;

import java.util.Scanner;

// 두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하세요.
// 단, 변수 b에 입력한 값이 a이하면 변수 b의 값을 다시 입력하세요.
public class Difference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		System.out.print("a의 값 : ");
		a = in.nextInt();
		
		while(true) {
			System.out.print("b의 값 : ");
			b = in.nextInt();
			if(b > a) break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		
		System.out.println("b - a는 " + (b - a) + "입니다.");
		
		in.close();
	}
}
