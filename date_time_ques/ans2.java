package date_time_ques;
import java.time.LocalDate;
import java.util.Scanner;
public class ans2 {
    public static void main(String[] args) {

        System.out.println("enter date (yyyy-mm-dd): ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        LocalDate date=LocalDate.parse(s);
        LocalDate newDate=date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate FinalDate=newDate.minusWeeks(3);
        System.out.println(FinalDate);
    }
}
