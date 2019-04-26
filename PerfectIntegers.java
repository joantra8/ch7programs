
public class PerfectIntegers {
	public static boolean isPerfectNumber(int number) {
		boolean p;
		int temp = 0;
		for (int i = 1; i <= number/2; i++) {
			if (number % i == 0) {
				temp += 1;
			}
		}
	if (temp == number) {
		p = true;
		return p;
	} else { 
		p = false;
		return p;
	}
	}
	public static void main (String []args) {
		boolean p;
		for (int i = 2; i <= 100; i++) {
			p = isPerfectNumber(i);
			if (p == true) {
				System.out.println(i);
			}
		}
	}

}
