import java.util.Scanner;

public class Guessthenumber {
	public static void guessthenumber() {
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int) (100 * Math.random());
		int i, g1, k = 5;

		System.out.println("A number is chosen between 1 to 100 \n Guess the number within" + k + "trials.");
		for (i = 0; i < k; i++) {
			System.out.println("Guess the number:");
			g1 = sc.nextInt();
			if (number == g1) {
				System.out.println("Congratulations! You guessed the number.");
				break;
			} else if (number > g1 && i != k - 1) {
				System.out.println("The number is greater than " + g1);
			} else if (number < g1 && i != k - 1) {
				System.out.println("The number is less than " + g1);
			}
		}

		if (i == k) {
			System.out.println("You have exhausted" + k + "trials.");
			System.out.println("The number was " + number);
		}
	}

	public static void main(String arg[]) {
		guessthenumber();
	}
}
