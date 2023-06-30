import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicateOne {
    public static void main(String[] args) {
        int[][] testCases  ={
                {1,2,3,4},
                {1,2,2,3,3,3,4,5,6,5},
                {1,1,1,1,1,1,1,2,2,2,3}
        };

        for(int i = 0; i < testCases.length; i++){
            System.out.println("----------------------Test Data: "+i);
            checkIfContainsOne(testCases[i]);
            checkIfContainsOneBoolean(testCases[i]);
        }
    }

    public static void checkIfContainsOne(int[] nums){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i: nums){
            if(hashMap.containsKey(i)){
                int value = hashMap.get(i) + 1;
                hashMap.put(i, value);
                System.out.println("Key= "+i+" Value="+hashMap.get(i));
            }
            else{
                hashMap.put(i, 1);
            }
        }
        System.out.println(hashMap.toString());
        hashMap.clear();
    }

    public static boolean checkIfContainsOneBoolean(int[] nums){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i: nums){
            if(hashMap.containsKey(i)){
                int value = hashMap.get(i) + 1;
                hashMap.put(i, value);
                System.out.println("Key= "+i+" Value="+hashMap.get(i));
                return true;
            }
            else{
                hashMap.put(i, 1);
            }
        }
        System.out.println(hashMap.toString());
        hashMap.clear();
        return false;
    }
}
