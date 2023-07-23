import java.util.Arrays;

public class ProductOfArrayExceptItsSelf {
    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        productExceptSelf(input);
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result =  new int[nums.length];

        result[0] = 1;
        int prefix = 1;
        for(int i=1; i<nums.length; i++){
            prefix = prefix * nums[i-1];
            result[i] = prefix;
        }

        System.out.println(Arrays.toString(result));

        int postfix = 1;
        result[result.length-1] *= postfix;
        postfix *= nums[nums.length-1];
        System.out.println(Arrays.toString(result));
        for(int i = nums.length-2; i>=0; i--){
            result[i] *= postfix;
            postfix *= nums[i];
        }


        System.out.println(Arrays.toString(result));
        return result;
    }


}
