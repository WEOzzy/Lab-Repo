package Chapter4.Challenges.RNATranscription;


import java.util.HashMap;

public class RNATranscription {
    /**
     * It may sound hard, but DNA gets converted to RNA with a simple method:
     * T becomes A,
     * A becomes U,
     * C becomes G,
     * G becomes C.
     *
     * receive string of DNA and return the equivalent RNA string.
     *
     * @param dna a String representing a series of DNA.
     * @return the RNA form of dna, using the formula for transcription written above.
     */
    public String transcript(String dna){
        HashMap<Character, Character> conversionMap = new HashMap<>();
        conversionMap.put('T', 'A');
        conversionMap.put('A', 'U');
        conversionMap.put('C', 'G');
        conversionMap.put('G', 'C');

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dna.length(); i++){
            sb.append(conversionMap.get(dna.charAt(i)));
        }

        return sb.toString();
    }
}
