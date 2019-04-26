
import java.util.Scanner;

public class NimStrategy {
	
	private static Scanner input;

    public static void isValidEntry(int stones, int user) {
    	boolean isValid = true;
    	if (stones < 3) {
    		if (user > 2) {
    		isValid = false;
    		}
    		if (user <= 2) {
    			isValid  = true;
    		}
    	}
    	if (stones < 2) {
    		if (user < 1) {
    			isValid = false;
    		}
    		if (user == 1) {
    			isValid = true;
    		}
    	}
    	if (user > 3) {
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
    public static void computerTurn(int stones, int computer) {
    	System.out.print("There are " + stones + "stones.");
    	System.out.print("The computer takes " + computer + " stones.");
    	}
    public static void main(String []args) {
    	int user;
    	int stones;
    	stones = (int) (16 * Math.random() + 15);
    	Scanner input = new Scanner(System.in);
    	
    	while (stones >= 1) {
    		user = NimStrategy.user("There are " + stones + "stones. How many would you like?" );
    		NimStrategy.isValidEntry(stones, user);
    		stones = stones - user;
    	if (stones >= 13) {
    		int computer = (int) (3 * Math.random() + 1);
    		NimStrategy.computerTurn(stones, computer);
    		stones = stones = computer;
    	} else if (stones == 9 || stones == 5) {
    		int computer = (int) (3 * Math.random() + 1);
    	NimStrategy.computerTurn(stones, computer);
    	stones = stones - computer;
    	} else if (stones == 12) {
    		int computer = 3;
    	} else if (stones == 11) {
    		int computer = 2;
    	} else if (stones == 10) {
    		int computer = 1;
    	    NimStrategy.computerTurn(stones, computer);
    	    stones = stones - computer;
    	} else if (stones == 6) {
    		int computer = 1;
    		NimStrategy.computerTurn(stones, computer);
    		stones = stones - computer;
    	} else if (stones == 7) {
    		int computer = 2;
    		NimStrategy.computerTurn(stones, computer);
    		stones = stones - computer;
    	} else if (stones == 8) {
    		int computer = 3;
    		NimStrategy.computerTurn(stones, computer);
    		stones = stones - computer;
    	} else if (stones == 2) {
    		int computer = 1;
    		NimStrategy.computerTurn(stones, computer);
    		stones = stones - computer;
    	} else if (stones == 3) {
    		int computer = 2;
    		NimStrategy.computerTurn(stones, computer);
    		stones = stones - computer;
    	} else if (stones == 4) {
    		int computer = 3;
    		NimStrategy.computerTurn(stones, computer);
    		stones = stones - computer;
    	} else if (stones == 1) {
    		int computer = 1;
    		NimStrategy.computerTurn(stones, computer);
    		stones = stones - computer;
    		if (stones == 1) {
    			System.out.print("The player beats the computer.");
    		}
    	}
    	if (stones == 0) {
    		System.out.println("The computer beats the player!");
    	}
    }
    	input.close();
    
    		
    		
    	}
    				
    	}
    


