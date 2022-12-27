package Chapter5.Challenges.InsertPosition;


public class InsertPosition {

    /**
     * Find the position that a number belongs to in a sorted array. See the test cases for examples.
     * You may assume no duplicate values.
     * @param nums an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted array.
     */
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (target > nums[i]) {
                i++;
            } else {
                return i;
            }
        }
        return nums.length;
    }
}
