package chap01;

import java.util.Scanner;

public class DigitsNo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("n의 값 : ");
			n = in.nextInt();
			if(n > 0) break;
			System.out.println("n은 양수를 입력해주세요!");
		}
		int i = 1;
		do {
			i++;
			n = n / 10;
		} while (n >= 10);
		
		System.out.println("n의 자리수는 " + i + "자리입니다.");
		
		in.close();
	}
}
