import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tempinCels=sc.nextInt();
        int fahrenheit=(tempinCels* 9/5)+32;
        System.out.println(fahrenheit);
    }
}
