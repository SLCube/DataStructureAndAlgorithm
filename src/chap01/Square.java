package chap01;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("단 수 : ");
		int num = in.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		in.close();
	}
}
