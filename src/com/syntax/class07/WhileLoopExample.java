package com.syntax.class07;

public class WhileLoopExample {

	public static void main(String[] args) {

		// print numbers 1-10;

		int num = 1;
		while (num <= 10) { // use this if you want to print number from 1 to 10
			num++; // when num++ is placed here it will not start with one but the next number
					// after it adding it up to 11
			System.out.print(num + " "); // use print to print out in one line and println if new line
			// or you can put num++ here and the output will be different, it will start
			// from 1-10

		}

		// print numbers from 10 to 100;
		System.out.println();

		int a = 10;
		while (a <= 100) {
			System.out.print(a + " ");
			a++;
		}

		// print numbers from 10 to 1;
		System.out.println();

		int b = 10;
		while (b >= 1) {
			System.out.print(b + " ");
			b--;
		}

		// print numbers from 100 to 50
		System.out.println();
		int x = 100;
		while (x >= 50) {
			System.out.print(x + " ");
			x--;
		}

		System.out.println();
		int d = -1;
		while (d >= -10) {
			System.out.print(d + " ");
			d--;
		}
		// print numbers from 1 to 20 but only EVEN numbers
		System.out.println();
		int e = 2;
		while (e <= 20) {
			System.out.print(e + " ");
			e += 2;
		}
		// 2 way
		System.out.println();

		int f = 1;

		while (f <= 20) {

			if (f % 2 == 0) {
				System.out.print(f + " ");

				f++;
			}
		}
	}
}
