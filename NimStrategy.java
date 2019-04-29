import java.util.Scanner;
/** Joan Tra
 * Period 1
 * Plays NimRandom game but specifically when the user has a certain number of stones left.
 */
public class NimStrategy {
	
	private static Scanner input;

    public static void isValidEntry(int numStones, int userEntry) {
    	/* Determines if user-requested amount is valid.
    	 * 
    	 */
    	boolean isValid = true;
    	if (numStones < 3) {
    		if (userEntry > 2) {
    		isValid = false;
    		}
    		if (userEntry <= 2) {
    			isValid  = true;
    		}
    	}
    	if (numStones < 2) {
    		if (userEntry < 1) {
    			isValid = false;
    		}
    		if (userEntry == 1) {
    			isValid = true;
    		}
    	}
    	if (userEntry > 3) {
    		isValid = false;
    	}
    	if (isValid == false) {
    		System.out.print("Please enter a valid entry.");
    	}
    }
    public static int user(String prompt) {
    	int num;
    	input = new Scanner(System.in);
    	System.out.print(prompt);
    	
    	do { 
    		num = input.nextInt();
    	} while (num < 0);
    	return num;
    }
    public static void computerTurn(int numStones, int computer) {
    	System.out.print("There are " + numStones + "stones.");
    	System.out.print("The computer takes " + computer + " stones.");
    	}
    public static void main(String []args) {
    	/* Executes each scenario of stones.
    	 * 
    	 */
    	int user;
    	int numStones;
    	numStones = (int) (16 * Math.random() + 15);
    	Scanner input = new Scanner(System.in);
    	
    	while (numStones >= 1) {
    		user = NimStrategy.user("There are " + numStones + "stones. How many would you like?" );
    		NimStrategy.isValidEntry(numStones, user);
    		numStones = numStones - user;
    	if (numStones >= 13) {
    		int computer = (int) (3 * Math.random() + 1);
    		NimStrategy.computerTurn(numStones, computer);
    		numStones = numStones = computer;
    	} else if (numStones == 9 || numStones == 5) {
    		int computer = (int) (3 * Math.random() + 1);
    	NimStrategy.computerTurn(numStones, computer);
    	numStones = numStones - computer;
    	} else if (numStones == 12) {
    		int computer = 3;
    	} else if (numStones == 11) {
    		int computer = 2;
    	} else if (numStones == 10) {
    		int computer = 1;
    	    NimStrategy.computerTurn(numStones, computer);
    	    numStones = numStones - computer;
    	} else if (numStones == 6) {
    		int computer = 1;
    		NimStrategy.computerTurn(numStones, computer);
    		numStones = numStones - computer;
    	} else if (numStones == 7) {
    		int computer = 2;
    		NimStrategy.computerTurn(numStones, computer);
    		numStones = numStones - computer;
    	} else if (numStones == 8) {
    		int computer = 3;
    		NimStrategy.computerTurn(numStones, computer);
    		numStones = numStones - computer;
    	} else if (numStones == 2) {
    		int computer = 1;
    		NimStrategy.computerTurn(numStones, computer);
    		numStones = numStones - computer;
    	} else if (numStones == 3) {
    		int computer = 2;
    		NimStrategy.computerTurn(numStones, computer);
    		numStones = numStones - computer;
    	} else if (numStones == 4) {
    		int computer = 3;
    		NimStrategy.computerTurn(numStones, computer);
    		numStones = numStones - computer;
    	} else if (numStones == 1) {
    		int computer = 1;
    		NimStrategy.computerTurn(numStones, computer);
    		numStones = numStones - computer;
    		if (numStones == 1) {
    			System.out.print("The player beats the computer.");
    		}
    	}
    	if (numStones == 0) {
    		System.out.println("The computer beats the player!");
    	}
    }
    	input.close();
    
    		
    		
    	}
    				
    	}
    


