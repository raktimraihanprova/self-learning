import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(
                new int[]{1,1,1,1,2,2,2,3,3,3,3},
                2
        )));
    }

    public static int[] topKFrequent(int[] nums, int k) {

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        int i = 0;
        for (int value: nums){
            if(!treeMap.containsKey(value)){
               treeMap.put(value, 1);
            }
            else{
                treeMap.put(value, treeMap.get(value)+1);
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<>(treeMap.entrySet());

        Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println(arrayList.toString());

        int[] finalArrayList = new int[k];
        for(int j = 0; j < k; j++){
            finalArrayList[j] = arrayList.get(j).getKey();
        }
        return  finalArrayList;
    }
}
