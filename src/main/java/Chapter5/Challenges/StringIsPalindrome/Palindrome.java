package Chapter5.Challenges.StringIsPalindrome;

public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String revStr = sb.reverse().toString();
        if (str.equals(revStr)) {
            return true;
        }
        return false;
    }
}
