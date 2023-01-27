package Chapter6.Challenges.MoveZeroes;

public class MoveZeroes {
    /**
     * Given an array, return a new array which retains the order of all non-zero elements from the old array,
     * but moves all the zero elements to the right of the non-zero elements.
     * @param nums
     * @return
     */
    public int[] move(int[] nums){
        int[] sortedNums = new int[nums.length];
        for (int i = 0, j = nums.length - 1, k = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sortedNums[j] = 0;
                j--;
            } else {
                sortedNums[k] = nums[i];
                k++;
            }
        }

        return sortedNums;
    }
}
