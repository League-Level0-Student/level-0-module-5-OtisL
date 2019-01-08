package algorithms;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println("A B C");
		for (int i=0; i<3;i++) {
			System.out.println(a+" "+b+" "+c);
			a=a+b;
			System.out.println(a+" "+b+" "+c);
			b=c;
			System.out.println(a+" "+b+" "+c);
			c=a;

			System.out.println(a+" "+b+" "+c);
		}
	}
}
