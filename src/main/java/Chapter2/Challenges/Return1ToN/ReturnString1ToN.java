package Chapter2.Challenges.Return1ToN;

public class ReturnString1ToN {
    /**
     * This method should create a string of all the numbers up to N.
     * eg, for input 7 it should be formatted something like this:
     * 1 2 3 4 5 6 7
     * spaces and newlines at the end of the string will not affect test results.
     *
     * spaces at the end of the string will not affect tests.
     * @param n the upper value (inclusive) of the outcoming string.
     * @return a string of all numbers between 1 to N.
     */
    public String returnNumber(int n){
        String str = "";
        for (int i=1; i<=n; i++){
            str = str.concat(Integer.toString(i)).concat(" ");
        }
        return str;
    }
}
