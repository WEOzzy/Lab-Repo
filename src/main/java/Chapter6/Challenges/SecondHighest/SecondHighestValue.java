package Chapter6.Challenges.SecondHighest;

import java.util.Arrays;

public class SecondHighestValue {
    /**
     * @param arr an array of ints.
     * @return the second highest value of arr.
     */
    public int getValue(int[] arr){
        int[] sortedArr = Arrays.stream(arr).distinct().sorted().toArray();
        return sortedArr[sortedArr.length - 2];
    }
}
