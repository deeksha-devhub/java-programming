import java.util.Arrays;

public class ConcatinationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,3,3};
        int result[] = new int[nums.length * 2];
        for(int i=0; i<nums.length; i++){
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
       System.out.println(Arrays.toString(result));
    }
}

