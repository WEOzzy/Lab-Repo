package Chapter3.Challenges.ArraySum;
public class ArraySum {
    /**
     * let's return the sum of all the values of an array - this is a very useful trick to know!
     * @param arr an array to be manipulated.
     * @return the sum of all values in arr.
     */
    public int sum(int[] arr){
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++){
            arrSum += arr[i];
        }
        return arrSum;
    }
}
