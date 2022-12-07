package Chapter4.Challenges.ReturnLongestString;

public class ReturnLongestString {
    /**
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        String longestString = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i].length() > longestString.length()){
                longestString = arr[i];
            }
        }
        return longestString;
    }
}
