package Chapter6.Challenges.PigLatinSentence;
/*
pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
word.

take in a sentence, and return a sentence with all words converted to pig latin.
example:

what a wonderful world
=
hatway aay onderfulway orldway

 */

public class PigLatinSentence {
    /**
     * Similar to the prior pigLatin problem, but applied to individual words in a String.
     * Recalling the String method used to separate words out of a sentence will be useful.
     * @param in A string of words separated by spaces.
     * @return a String of words in which all the constituent words of in have been converted into pigLatin.
     */
    public String returnPigLatinSentence(String in){
        StringBuilder sb = new StringBuilder();
        String [] strArr = in.split(" ");
        for (int i = 0; i < strArr.length; i++){
            sb.append(strArr[i].substring(1));
            sb.append(strArr[i].charAt(0));
            sb.append("ay");
            if (i != strArr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
