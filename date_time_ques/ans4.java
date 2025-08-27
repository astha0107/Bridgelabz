package date_time_ques;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ans4 {
    public static void main(String[] args) {
         System.out.print("Enter date (yyyy-MM-dd): ");
         Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        LocalDate date_1 = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println("Enter second date (yyyy-MM-dd): ");
        String secinput = sc.nextLine();
        LocalDate date_2 = LocalDate.parse(secinput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        
        if (date_1.isBefore(date_2)) {
            System.out.println(date_1 + " is BEFORE " + date_2);
        } else if (date_1.isAfter(date_2)) {
            System.out.println(date_1 + " is AFTER " + date_2);
        } else if (date_1.isEqual(date_2)) {
            System.out.println(date_1 + " is EQUAL to " + date_2);
        }
    }
}
