package Chapter6.Challenges.ReverseAllWords;

public class ReverseAllWords {
    /**
     * Given a string with multiple words separated by spaces,
     * reverse all the words while maintaining the order.
     * eg:
     * This is the original
     * becomes
     * sihT si eht lanigiro
     *
     * @param str
     * @return str, with every word (delineated by spaces) reversed, while keeping the old order.
     */
    public String reverse(String str){
        StringBuilder sb = new StringBuilder();
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            char[] revStr = strArr[i].toCharArray();
            for (int j = revStr.length - 1; j >= 0; j--) {
                sb.append(revStr[j]);
            }
            if (i != strArr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
