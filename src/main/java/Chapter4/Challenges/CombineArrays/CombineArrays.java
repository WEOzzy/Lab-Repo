package Chapter4.Challenges.CombineArrays;

public class CombineArrays {
    /**
     * Combine two arrays into a single array.
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int combLength = arr1.length + arr2.length;
        int[] combArr = new int[combLength];
        int j = 0;
        for (int i=0; i<arr1.length; i++){
            combArr[j] = arr1[i];
            j++;
        }
        for (int i=0; i < arr2.length; i++){
            combArr[j] = arr2[i];
            j++;
        }
        return combArr;
    }
}
