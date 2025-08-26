package strings;

public class ans11 {
    public static void main(String[] args) {
        String str = "Java programming language";
        String[] words = str.split(" ");
        String longest = "";

        for (String w : words) {
            if (w.length() > longest.length())
                longest = w;
        }

        System.out.println("Longest word: " + longest);
    }
}
