package chap01;

public class SumOf {
	static int sumof(int a, int b) {
		int min;
		int max;
		if(a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		int sum = 0;
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("sumof(3, 5) : " + sumof(3, 5));
		
	}
}
