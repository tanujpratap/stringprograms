public class substring {
    static String get_substring(String str ,int si,int ei){
        String substring="";
        for(int i=si;i<ei;i++){
            substring+ =str.charAt(i);
        }
        return substring;
    }

    
    public static void main(String[] args) {
        String Str="helloworld";
        System.out.println(get_substring(Str, 2, 6));
    }
    
}
