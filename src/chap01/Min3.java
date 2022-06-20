package chap01;

import java.util.Scanner;

// 세 값의 최솟값을 구하는 min3 method를 작성하세요.
public class Min3 {
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("세 정수의 최솟값을 구합니다.");
		
		System.out.print("a의 값 : ");
		int a = in.nextInt();
		System.out.print("b의 값 : ");
		int b = in.nextInt();
		System.out.print("c의 값 : ");
		int c = in.nextInt();
		
		int min = min3(a, b, c);
		System.out.println("최솟값은 " + min + "입니다.");
		
		in.close();
		
	}
}
