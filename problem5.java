import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        double h=sc.nextInt();
        double vol=Math.PI * r*r*h;
        System.out.println(vol);
    }
}
