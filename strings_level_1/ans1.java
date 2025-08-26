package strings_level_1;

import java.util.Scanner;

public class ans1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s1.length()!=s2.length()){
            System.out.println(false);
        }else{
            boolean isequal=true;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    isequal=false;
                    break;
                }
            }
            System.out.println(isequal);
        }
    }
}
