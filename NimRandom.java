import java.util.Scanner;
public class NimRandom {
	public static void isValidEntry() {
		Scanner input = new Scanner(System.in);
		int entry;
		int newAmount;
		
		
		do {
		System.out.print("There are" + ((int)16 * Math.random() + 15) + "stones. How many would you like? ");
			entry = input.nextInt();
			newAmount = (int)(16 * Math.random() + 15) + entry;
		} while (newAmount != 0);
			
	
		
		
		}
		
		

}

