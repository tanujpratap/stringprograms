public class string_compress {
    static String compress(String str){
        String newstring="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;

            }
            newstring+= str.charAt(i);
            if(count>1){
                newstring += count.toString( );
            }
        }
return newstring;
    }
    public static void main(String[] args) {
        String str="aaabbbbccccdddd";
        System.out.println(compress(str));
    }
    
}
