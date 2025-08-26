package strings;

import java.util.Scanner;

public class ans2 {
    public static void main(String[] args) {
        //vowel count
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int count=0;
        char ans[]=s.toCharArray();
        for(char ch:ans){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
