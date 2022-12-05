package Chapter3.Challenges.IsSorted;
public class IsSorted {
    /**
     * @param arr an int array to be manipulated
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
