package strings;

public class ans13 {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }

        System.out.println("Without duplicates: " + sb);
    }
    
}
