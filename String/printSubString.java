package String;

public class printSubString {
    public static String printSubstrings(String str, int si, int ei){
        String substr = " ";
        for(int i = si; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args){
        String str = "Sushant";
        System.out.println(printSubstrings(str, 0, 3));
    }
}
