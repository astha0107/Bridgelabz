package control_flow;

import java.util.Scanner;

public class ans1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            System.out.println("not eligible to vote");
        }else if(age>=18){
            System.out.println("eligible to vote");
        }
    }
}
