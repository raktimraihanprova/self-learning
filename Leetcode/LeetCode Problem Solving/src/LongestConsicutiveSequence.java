import java.sql.Array;
import java.util.*;

public class LongestConsicutiveSequence {

    public static void main(String[] args) {
        int[] nums = {0,3,7,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i: nums){
            hashSet.add(i);
        }

        int length = 0;
        int maxLength = 0;
        for(int i = 0; i <nums.length; i++){
            if(!hashSet.contains(nums[i]-1)){
                length = 0;
                while (hashSet.contains(nums[i]+length)){
                    length++;
                }
                maxLength = Math.max(length, maxLength);
            }
        }
        return maxLength;
    }
}
