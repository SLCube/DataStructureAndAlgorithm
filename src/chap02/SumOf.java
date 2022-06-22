package chap02;

import java.util.Scanner;

public class SumOf {
    public static int sumOf(int[] arr) {
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("요소수 : ");
        int num = in.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = in.nextInt();
        }

        System.out.println("배열 요소들의 합 : " + sumOf(arr));
        in.close();
    }
}
