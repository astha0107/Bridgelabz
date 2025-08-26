package strings;

public class ans9 {
    public static void main(String[] args) {
        //compress the string
        String s="aabbcccd";
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<s.length();i++){
            if(i<s.length() && s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                sb.append(s.charAt(i-1)).append(count);
                count=1;
            }
        }
        System.out.println(sb.toString());
        
    }
}
