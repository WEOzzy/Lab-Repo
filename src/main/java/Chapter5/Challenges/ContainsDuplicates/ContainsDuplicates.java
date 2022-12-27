package Chapter5.Challenges.ContainsDuplicates;


import java.util.Arrays;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        int []nums2 = Arrays.stream(nums).distinct().toArray();

        return (nums.length > nums2.length);
    }
}
