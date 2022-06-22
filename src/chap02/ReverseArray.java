package chap02;

import java.util.Scanner;

public class ReverseArray {
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1]; 
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = in.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = in.nextInt();
        }

        reverse(x);

        System.out.println("요소를 역순으로 정렬했습니다.");
        
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
        in.close();
    }
}
