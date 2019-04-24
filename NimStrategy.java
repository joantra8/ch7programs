import java.util.Scanner;
public class NimStrategy {
	public static void isValidEntry() {
	}
	public static void drawStones() {
	}
	public static void userTurn(int num) {
		
	}
		
		
		
	public static void main (String []args) {
		int num = (int) (16 * Math.random() + 15);
		
		
		while (num > 0) {
			num = userTurn(num);
			
		if (num <= 0) {
			System.out.print("You Win!");
		}
			
		}


		
	}
		

}
