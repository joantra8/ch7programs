import java.util.Scanner;
public class GuessingGame {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		
		double myNum;
		int guess;
		
		myNum = 19 * Math.random() + 1;
		
		
		System.out.print("Enter a number between 1 and 20: ");
		guess = input.nextInt();
		
	
		
		while (guess != myNum) {
			giveHint();
			
	    if (guess == myNum)
		 System.out.print("You got it!");	
	    
		}
		
		input.close();
		
	}
		public static void giveHint() {
		Scanner input = new Scanner(System.in);	
		
		final int myNum = 4;
		int guess;
		
		
		System.out.print("Enter a number between 1 and 20: ");
		guess = input.nextInt();
		
	
		if (guess > myNum) {
			System.out.println("Hint: try a lower number. ");
			guess = input.nextInt();
			
		if (guess < myNum) {
			System.out.println("Hint: try a higher number. ");
			guess = input.nextInt();
			
		
			
		} 
		
		input.close();
		
		{
		
		 if (guess == myNum)
			 System.out.print("You got it!");
			
	
		 
		}
		 
	
	}
}
}



