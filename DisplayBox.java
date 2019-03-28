mport java.util.Scanner;

public class DisplayBox {
	public static void drawBar(double height) {
		for (int i = 0; i <= height; i++) {
			System.out.print("*");
		}
		System.out.println();
}
	public static void drawBar2(double width) {
		for (int i = 0; i <= width; i++) {
			System.out.println("*");
		}
	}
	
	public static void drawBox() {
	
		
	
}
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		double height;
		System.out.print("Enter the height: ");
		height = input.nextDouble();
		double width;
		System.out.print("Enter the width: ");
		width = input.nextDouble();
		input.close();
	
		
