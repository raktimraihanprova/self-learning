import java.util.Arrays;

public class AnargramOfText {
    public static void main(String[] args) {
        String s = "cat";
        String t = "actt";

        System.out.println(anagramOfTextPrint(s,t));
    }

    public static boolean anagramOfTextPrint(String s, String t){
        char[] chrArrOfFstStr = s.toCharArray();
        char[] chrArrOfScndStr = t.toCharArray();

        Arrays.sort(chrArrOfFstStr);
        Arrays.sort(chrArrOfScndStr);

        int i = 0;
        int j = 0;

        if(chrArrOfFstStr.length != chrArrOfScndStr.length){
            return false;
        }

        while(i < chrArrOfFstStr.length && j<chrArrOfScndStr.length){
            if(chrArrOfFstStr[i] != chrArrOfScndStr[j]){
                return false;
            }
            i++;
            j++;
        }

        return true;
    }
}
