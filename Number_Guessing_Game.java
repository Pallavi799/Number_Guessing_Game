import java.util.Scanner;
public class Number_Guessing_Game {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int number = 1+(int)(100*Math.random());
		int j=5;
		int i,guess;
		System.out.println("Choose the number between 1 to 100.\n"+"Guess the number within 5 tries.");
		for(i=0;i<j;i++) {
			System.out.println("Guess the number.");
			guess = S.nextInt();
			if(number == guess) {
				System.out.println("Congratulations! You guessed the number.");
			}
			else if(number>guess && i!=j-1) {
				System.out.println("The numer is greater than " +guess);
			}
			else if(number<guess && i!=j-1) {
				System.out.println("The numer is less than " +guess);
			}
		}
		if(i==j) {
			System.out.println("You didn't get the number in 5 tries");
			System.out.println("You lose the game");
			 System.out.println("The number was " + number);
		}
	}
}
