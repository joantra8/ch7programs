import java.util.Scanner;
public class GuessingGame {
	public static int pickANumber (int lowNum, int highNum) {
		double theNumber = (Math.random() * highNum + lowNum);
		
		return(int)theNumber;
	}
	public static void giveHint(int userGuess, int theNumber) {
		
		if (userGuess > theNumber)
			System.out.println("Hint: try a lower number.");
	    if (userGuess < theNumber)
	    	System.out.println("Hint: try a higher number.");
	}
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		int theNumber = pickANumber(1,20);
		int userGuess;
		
		do {
			System.out.print("Enter a number betweeen 1 and 20.");
			userGuess = input.nextInt();
			giveHint(userGuess, theNumber);
		} while (userGuess != theNumber);
		
		
		if (userGuess == theNumber) {
			System.out.print("You won!");
			
			input.close();
		}
	}

}


