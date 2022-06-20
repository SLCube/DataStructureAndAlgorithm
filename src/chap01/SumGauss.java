package chap01;

import java.util.Scanner;

public class SumGauss {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int sum = n * (n + 1) / 2;
		
		System.out.println("sum : " + sum);
	}
}
