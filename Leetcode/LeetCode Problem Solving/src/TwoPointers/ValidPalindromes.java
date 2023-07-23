package TwoPointers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindromes {
    public static void main(String[] args) {
        String s = "P0P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        if(s.length() == 1){
            return true;
        }

        StringBuilder temp = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(Pattern.matches("[A-Za-z0-9]", Character.toString(s.charAt(i)))){
                temp.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        int i=0, j=temp.length()-1;

        while(i<=j){
            if(temp.charAt(i) != temp.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
