import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Menu m = new Menu();

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome, here are your options:");
		System.out.println("\n");
		System.out.println("p: Practice");
		System.out.println("v: View stickings");
		System.out.println("s: Generate a sticking");
		System.out.println("e: Exit");
		
		char option;
			
			do 
			{
				System.out.println("Enter an option");
				option = scan.next().charAt(0);
				System.out.println("\n");
				
				switch(option) {
					case 'p':
						System.out.println("You pressed p!");
						break;
					case 'v':
						System.out.println("You pressed !");
					default:
						System.out.println("not a valid option");
				}
			} while(option != 'e'); 


		System.out.print("how many strokes would you like? ");
		int numStrokes = scan.nextInt();
		
		Random rand = new Random();
		char[] strokes = {'R','L','r','l'};
		
		for(int i = 0; i < numStrokes; i++) {
			int randomNum = rand.nextInt(strokes.length);
			System.out.print(strokes[randomNum]);
		}
		System.out.print(" ");
		
		for(int i = 0; i < numStrokes; i++) {
			int randomNum = rand.nextInt(strokes.length);
			System.out.print(strokes[randomNum]);
		}
	}
}
		
		
		



