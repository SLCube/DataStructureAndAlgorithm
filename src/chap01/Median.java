package chap01;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.
public class Median {
	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			} else if(a <= c) {
				return a;
			} else {
				return c;
			}
		} else if(b > c) {
			return c;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		
		System.out.print("a의 값 : ");
		int a = in.nextInt();
		System.out.print("b의 값 : ");
		int b = in.nextInt();
		System.out.print("c의 값 : ");
		int c = in.nextInt();
		
		System.out.println("중앙값은 : " + med3(a, b, c) + "입니다.");
		
		in.close();
	}
}
