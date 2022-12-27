package Chapter5.Challenges.LargestSum;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the array. A number can't be added
     * to itself, unless there are duplicates.
     * @param num an array of ints.
     * @return the largest possible sum of separate numbers from num.
     */
    public int bigSum(int[] num){
        int maxSum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (i != j ) {
                    if (num[i] + num[j] > maxSum) {
                        maxSum = num[i] + num[j];
                    }
                }
            }
        }
        return maxSum;
    }
}

