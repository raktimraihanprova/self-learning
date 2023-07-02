import java.util.*;

public class AnargramGroup {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> finalList = new ArrayList<>();
        String[] tempString = new String[strs.length];

        int i = 0;
        for(String s: strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String str2 = new String(temp);
            System.out.println(str2);
            tempString[i] = str2;
            i++;
        }


        HashMap<String, List<String>> map = new HashMap<>();
        i = 0;

        for(String s: tempString){
            if(!map.containsKey(s)){
                List<String> tempList = new ArrayList<>();
                tempList.add(strs[i]);
                map.put(s, tempList);
            }
            else {
                List<String> tempList = map.get(s);
                tempList.add(strs[i]);
                map.put(s, tempList);
            }
            i++;
        }

        for(Map.Entry<String, List<String>> tempMap: map.entrySet()){
            finalList.add(tempMap.getValue());
        }
        return finalList;
    }
}
