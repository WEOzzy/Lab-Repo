package Chapter5.Challenges.CharComparison;

import java.util.Arrays;

public class CharComparison {
    /**
     * given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
        String str = "s";
        char ch = 'c';
        Character.toUpperCase(ch);

        int arrayLength;
        if (a.length < b.length) {
            arrayLength = a.length;
        } else {
            arrayLength = b.length;
        }

        for (int i = 1; i < arrayLength; i++) {
            if (a[i] < b[i]) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            }
        }
        if (a.length > b.length) {
            return 1;
        }
        return 0;
    }
}
