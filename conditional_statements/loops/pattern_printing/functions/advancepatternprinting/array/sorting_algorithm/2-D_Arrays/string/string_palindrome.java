//package 2-D_Arrays.string;

public class string_palindrome {
    public static void main(String[] args) {
        String str="racecar";
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("not palindrome");
            }
        }
       System.out.println("palindrome");
    }
    
}
