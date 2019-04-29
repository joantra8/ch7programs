package q4;
import java.util.Scanner;
public class GuessingGame {
	public static int pickANumber (int lowNum, int highNum) {
		double myNum = (Math.random() * highNum + lowNum);
		
		return(int)myNum;
	}
	public static void giveHint(int guess, int myNum) {
		
		if (guess > myNum)
			System.out.println("Hint: try a lower number.");
	    if (guess < myNum)
	    	System.out.println("Hint: try a higher number.");
	}
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		int myNum = pickANumber(1,20);
		int guess;
		
		do {
			System.out.print("Enter a number betweeen 1 and 20: ");
			guess = input.nextInt();
			giveHint(guess, myNum);
		} while (guess != myNum);
		
		
		if (guess == myNum) {
			System.out.print("You won!");
			
			input.close();
		}
	}

}
