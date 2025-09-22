package control_flow;

import java.util.Scanner;

public class ans3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<a;i++){
            if(i%2==0){
                System.out.println("even num are: "+i);
            }else{
                System.out.println("odd num are: "+i);
            }
        }
    }
}
