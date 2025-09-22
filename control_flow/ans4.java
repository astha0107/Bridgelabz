package control_flow;

import java.util.Scanner;

public class ans4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int power=sc.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result=result*power;
        }
        System.out.println("power is "+ power+"result is: "+result);
    }
}
