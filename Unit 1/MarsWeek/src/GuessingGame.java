import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public GuessingGame() {
        String greet = "Howdy, what's your name?";
        System.out.println(greet);
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(100) + 1;
        int attempts = 1;
        String name = input.next();
        System.out.printf("%s, I'm thinking of a number between 1 and 100.\n", name);
        System.out.println("Try to guess my number.");
        int guess = input.nextInt();

        while (guess != answer) {
            System.out.printf("Your guess? %d\n", guess);
            if (guess < answer) {
                System.out.println("Your guess is too low, try again.");     
            } else {
                System.out.println("Your guess is too high, try again.");
            }
            guess = input.nextInt();
            attempts++;
        }
        System.out.printf("Well done, %s! You found my number in %d tries!\n", name, attempts);
    }
    public static void main(String[] args) {
    }

}
