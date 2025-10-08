package String;

public class string {
    public static void main(String[] args){
        String name = "Sushant";
        String s1 = new String("rounak");
        System.out.println(s1);
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.startsWith("Su"));
        System.out.println(name.endsWith("nt"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("ha"));
        System.out.println(name.indexOf("z")); //if not found then it will return -1
        System.out.println(name.lastIndexOf("s"));
        System.out.println(name.equals("sushant"));
        System.out.println(name.equalsIgnoreCase("sushant"));
        System.out.println(name.replace('a', 'p'));
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));
        System.out.println(name.trim()); //it will remove the spaces before and after the string
    }
}
