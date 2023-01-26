package Chapter5.Challenges.SubArray;

public class SubArray {
    /**
     * Return only a part of an array.
     * @param nums an array of ints.
     * @param start the starting index, inclusive.
     * @param end the ending index, exclusive.
     * @return a sub-array of nums containing the values between start and end.
     */
    public int[] sub(int[] nums, int start, int end){
        int[] nums2 = new int[end - start];
        for (int i = start, j = 0; i < end; i++, j++) {
            nums2[j] = nums[i];
        }
        return nums2;
    }
}
