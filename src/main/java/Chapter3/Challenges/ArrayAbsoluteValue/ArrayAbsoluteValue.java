package Chapter3.Challenges.ArrayAbsoluteValue;

import static java.lang.Math.abs;

public class ArrayAbsoluteValue {
    /**
     * Given an array of integers, produce an array of integers composed of the absolute values of all the numbers
     * in nums. Absolute value represents the distance from zero, so negative numbers should become positive and
     * positive numbers can stay the same.
     * @param nums an array to be manipulated.
     * @return the absolute value array of nums.
     */
    public int[] getArrayAbs(int[] nums){
        for (int i = 0; i < nums.length; i++){
            nums[i] = abs(nums[i]);
        }
        return nums;
    }
}