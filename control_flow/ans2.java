package control_flow;

import java.util.Scanner;

public class ans2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0){
            System.out.println("num is negative");
        }else if(a==0){
            System.out.println("num is zero");
        }else{
            System.out.println("num is positive");
        }
    }
}
