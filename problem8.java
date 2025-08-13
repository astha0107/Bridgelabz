import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double expo=sc.nextDouble();
        double res=Math.pow(base,expo);
        System.out.println(res);
    }
}
