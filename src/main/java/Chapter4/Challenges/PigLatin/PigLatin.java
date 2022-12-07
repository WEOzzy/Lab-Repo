package Chapter4.Challenges.PigLatin;

public class PigLatin {
    /**
     * pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     *     take in a word and return the pig latin form.
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        String syl1 = in.substring(1);
        String ch1 = in.substring(0, 1);
        return (syl1 + ch1 +"ay");
    }
}
