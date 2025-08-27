package date_time_ques;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ans4 {
    public static void main(String[] args) {
         System.out.print("Enter first date (yyyy-MM-dd): ");
         Scanner sc=new Scanner(System.in);
        String firstInput = sc.nextLine();
        LocalDate date1 = LocalDate.parse(firstInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.print("Enter second date (yyyy-MM-dd): ");
        String secondInput = sc.nextLine();
        LocalDate date2 = LocalDate.parse(secondInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is BEFORE " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is AFTER " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is EQUAL to " + date2);
        }
    }
}
