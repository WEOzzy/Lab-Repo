package Chapter4.Challenges.MaxMinusMin;

public class MaxMinusMin {
    /**
     * return the difference between the highest and lowest values of the array.
     * @param nums an int array.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(int[] nums){
        int max = nums[0];
        int min = max;
        for (int i = 0; i < nums.length; i++){
            if (max < nums[i]){
                    max = nums[i];
            }
            if (min > nums[i]){
                min = nums[i];
            }
        }
        return max - min;
    }
}
