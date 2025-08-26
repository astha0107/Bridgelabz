package strings;
import java.util.Scanner;
public class ans3 {
    public static void main(String[] args) {
        //count length without len function
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        char ans[]=s.toCharArray();
        int count=0;
        for(char ch:ans){
            count++;
        }
        System.out.println(count);
    }
}
