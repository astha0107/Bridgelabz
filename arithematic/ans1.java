package arithematic;
import java.util.Scanner;
import java.util.Random;
public class ans1 {
    public static void main(String[] args) {
        
    }
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low; // inclusive range
    }
     public static String getFeedback(Scanner sc, int guess) {
        System.out.print("Is the number " + guess + "? (enter: high / low / correct): ");
        return sc.nextLine().trim().toLowerCase();
    }
    
}
