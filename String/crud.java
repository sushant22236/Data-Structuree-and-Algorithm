package String;

import java.util.*;

public class crud {
    public static void main(String args[]) {
        createString cs = new createString();
        cs.createString();
    }
}

class createString {
    public void createString() {
        String s = " ";
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(updateString(s, 3, 'h'));
        System.out.println(insertWithoutDelete(s, 6, 'z'));
        findElementAtIndex(s, 2);

    }

    public String updateString(String str, int index, char c) {
        if (index < 0 || index >= str.length()) {
            System.out.println("Invalid index");
            return str;
        }

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == index) {
                newStr += c;
            } else {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    public String deleteString(String str, int index) {
        if (index < 0 || index >= str.length()) {
            System.out.println("Invalid index");
            return str;
        }

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == index) {
                continue;
            } else {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    public String insertWithoutDelete(String str, int index, char c) {
        if (index < 0 || index > str.length()) {
            System.out.println("Invalid index");
            return str;
        }

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == index) {
                newStr += c;
            }
            newStr += str.charAt(i);
        }

        System.out.println(newStr.length() + " is the length of new String");

        if (index == str.length()) {
            newStr += c;
        }

        return newStr;
    }

    public String findElementAtIndex(String str, int index) {
        if (index < 0 || index >= str.length()) {
            System.out.println("Invalid index");
            return str;
        }

        for (int i = 0; i < str.length(); i++) {
            if (i == index) {
                System.out.println(str.charAt(i));
            }
        }

        return str;

    }

}
