package strings;

public class ans10 {
    public static void main(String[] args) {
        String str = "Java123";
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                sb.append((char)(c - 32));
            else if (c >= 'A' && c <= 'Z')
                sb.append((char)(c + 32));
            else
                sb.append(c);
        }

        System.out.println("Toggled: " + sb);
    }
}
