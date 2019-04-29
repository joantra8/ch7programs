]package q4;
/** Joan Tra
 * Period 1
 * Displays factors of each number and sums them together. If the sum of the factors equal the number, the number is displayed.
 */
public class PerfectIntegers {
	/* 
	 * Finds the factors and sums them.
	 */
	public static boolean isPerfect(int num) {
		boolean p;
		int temp = 0;
		for (int i = 1; i <= num/2; i++) {
			if (num % i == 0) {
				temp += 1;
			}
		}
	if (temp == num) {
		p = true;
		return p;
	} else { 
		p = false;
		return p;
	}
	}
	/* Displays numbers.
	 * 
	 */
	public static void main (String []args) {
		boolean p;
		for (int i = 1; i <= 100; i++) {
			p = isPerfect(i);
			if (p == true) {
				System.out.println(i);
			}
		}
	}

}
