package Chapter6.Challenges.ReverseArray;

public class ReverseArray {
    /**
     * @param nums a list of ints.
     * @return a list of ints that is in the reversed order of nums.
     */
    public int[] reverse(int[] nums){
        int[] revNums = new int[nums.length];
        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
            revNums[j] = nums[i];
        }
        return revNums;
    }
}
