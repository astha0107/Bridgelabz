package strings;

import java.util.Scanner;

public class ans7 {
    public static void main(String[] args) {
        // reverse each word in a sentence
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []str=s.split(" ");
       StringBuilder sb=new StringBuilder();
       for(String ss:str){
        sb.append(new StringBuilder(ss).reverse()).append(" ");
       }
       System.out.println(sb.toString().trim());
    }
}
