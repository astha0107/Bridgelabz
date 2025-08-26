package strings;

import java.util.Scanner;

public class ans4 {
    public static void main(String[] args) {
        //replace spaces with hypen
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=s.replace(" ", "-");
        System.out.println(ans);
    }
}
