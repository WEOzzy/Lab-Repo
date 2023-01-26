package Chapter5.Challenges.MissingValue;

public class MissingValue {

    /**
     * assume that arr is intended to have arrays that increment by 1 for each index. eg, {4,5,6,7}.
     * arr may be missing a value eg, {4,5,6,7,9} is missing 8.
     * @param arr an array of ints.
     * @return return the missing value in an ascending array of numbers. return -1 if no missing value exists.
     */
    public static int getMissingValue(int[] arr){
        int expVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (expVal != arr[i]) {
                return expVal;
            } else {
                expVal++;
            }
        }
        return -1;
    }
}
