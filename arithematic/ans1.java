package arithematic;
import java.util.Scanner;
import java.util.Random;
public class ans1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guess = 0;
        int attempt = 0;
        System.out.println("Guess a number between 1 and 100");
        while (guess != number) {
            guess = sc.nextInt();
            attempt++;
            if (guess < number) {
                System.out.println("Too low! Try again.");
            }
            else if (guess > number) {
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("Congratulations! You've guessed the number " + number + " in " + attempt + " attempts.");
            }
        }

    }
    

}
