package strings_level_1;

import java.util.Scanner;

public class ans3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        char[] manualArr = chararray(s1);
        char[] builtInArr = s1.toCharArray();
         boolean isEqual = compareCharArrays(manualArr, builtInArr);
         System.out.println("Manual char array: " + arrayToString(manualArr));
        System.out.println("Built-in char array: " + arrayToString(builtInArr));
        System.out.println("Are both arrays equal? " + isEqual);

    }
    public static char[]chararray(  String s1){
        char [] arr=new char[s1.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s1.charAt(i);
        }
        return arr;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static String arrayToString(char[] arr) {
        String result = "";
        for (char c : arr) {
            result += c;
        }
        return result;
    }
    
}
