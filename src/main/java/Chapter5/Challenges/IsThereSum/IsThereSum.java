package Chapter5.Challenges.IsThereSum;

public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){
        // test all two number combinations
        // this is very inefficient
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && target == (arr[i] + arr[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
