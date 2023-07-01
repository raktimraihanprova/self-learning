import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for(int i: nums){
            map.put(i, index);
            index++;
        }
        index = 0;

        for(int i: nums){
           if(map.containsKey(target-i) && map.get(target-i)!= index){
               return new int[]{index,map.get(target-i)};
           }
           index++;
        }

        return new int[]{0,0};
    }
}
