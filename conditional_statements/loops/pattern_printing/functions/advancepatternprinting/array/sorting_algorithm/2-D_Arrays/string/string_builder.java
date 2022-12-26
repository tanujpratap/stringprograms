public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<'g';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        //time complexity=o(ch.lenngth);
    }
    
}
